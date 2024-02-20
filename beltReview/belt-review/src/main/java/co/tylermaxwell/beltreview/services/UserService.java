package co.tylermaxwell.beltreview.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import co.tylermaxwell.beltreview.models.LoginUser;
import co.tylermaxwell.beltreview.models.User;
import co.tylermaxwell.beltreview.repositories.UserRepository;
import jakarta.servlet.http.HttpSession;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public User register(User newUser, BindingResult result, HttpSession session) {
    
        if(findUserByEmail(newUser.getEmail()) != null){
            result.rejectValue("email", "Email", "Already Registered");
        }
   
        if(!newUser.getPassword().equals(newUser.getConfirm())){
            result.rejectValue("password", "Password", "passwords must match");
        }
   
        if(result.hasErrors()){
            return null;
        }
   
        String hashedPW = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashedPW);

        User user = userRepository.save(newUser);
        logUserIn(session, user);
   
        return user;
    }



    public User login(LoginUser newLoginObject, BindingResult result, HttpSession session) {
        
        User user = findUserByEmail(newLoginObject.getEmail());
    
        if(user == null){
            result.rejectValue("email", "EmailLogin", "Invalid Credentials");
        } else if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())){
            result.rejectValue("password", "PasswordLogin", "Invalid Credentials");
        }
            
        if(result.hasErrors()){
                return null;
            }
        
            logUserIn(session, user);
            return user;
    }

    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }

    private User findUserByEmail(String email){
        return userRepository.findByEmail(email).orElse(null);
    }

    private void logUserIn(HttpSession session, User user){
        session.setAttribute("userId", user.getId());
        session.setAttribute("userName", user.getUserName());


    }
}