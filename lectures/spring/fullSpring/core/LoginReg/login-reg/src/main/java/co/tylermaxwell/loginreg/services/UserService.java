package co.tylermaxwell.loginreg.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import co.tylermaxwell.loginreg.models.LoginUser;
import co.tylermaxwell.loginreg.models.User;
import co.tylermaxwell.loginreg.repositories.UserRepository;
import jakarta.servlet.http.HttpSession;
    
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    
    public User register(User newUser, BindingResult result, HttpSession session) {
             
        // Reject if email is taken (present in database)
        // if(userRepository.findByEmail(newUser.getEmail()).isPresent()){
        //     result.rejectValue("email", "Email", "Already registered");
        // }
        
        if(findUser(newUser.getEmail()) != null){
            result.rejectValue("email", "Email", "Already registered");

        }
        
        // Reject if password doesn't match confirmation
        if(!newUser.getPassword().equals(newUser.getConfirm())){
            result.rejectValue("password", "Password", "Passwords must match");
            result.rejectValue("confirm", "Confirm", "Passwords must match");
        }

        // Return null if result has errors
        if(result.hasErrors()){
            return null;
        }
    
        // Hash password
        String hashedPW = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());

        // set password
        newUser.setPassword(hashedPW); 
        
        //save user to database
        User user = userRepository.save(newUser);

        // log user in
        session.setAttribute("userId", user.getId());
        session.setAttribute("userName", user.getUserName());
        
        return user;

    }

    public User login(LoginUser newLoginObject, BindingResult result, HttpSession session) {

        // Find user in the DB by email
        // User user = userRepository.findByEmail(newLoginObject.getEmail()).orElse(null);
        
        User user = findUser(newLoginObject.getEmail());

        // Reject if NOT present
        if(user == null){
            result.rejectValue("email", "EmailLogin", "Invalid Credentials");
        }
        
        // Reject if BCrypt password match fails
        else if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())){
            result.rejectValue("password", "PasswordLogin","Invalid Credentials");
        }
    
        // Return null if result has errors
        if(result.hasErrors()){
            return null;
        }

        // log user in

        session.setAttribute("userId", user.getId());
        session.setAttribute("userName", user.getUserName());
        // return the user object
        return user;
    }

    private User findUser(String email){
        return userRepository.findByEmail(email).orElse(null);
    }
}
