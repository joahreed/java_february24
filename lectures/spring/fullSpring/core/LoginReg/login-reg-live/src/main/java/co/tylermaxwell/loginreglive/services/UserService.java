package co.tylermaxwell.loginreglive.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import co.tylermaxwell.loginreglive.models.LoginUser;
import co.tylermaxwell.loginreglive.models.User;
import co.tylermaxwell.loginreglive.repositories.UserRepository;
    
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
        System.out.println(newUser);
        // Reject if email is taken (present in database)
        if(userRepository.findByEmail(newUser.getEmail()).isPresent()){
            result.rejectValue("email", "Email", "Already Registered");
        }


        // Reject if password doesn't match confirmation
        if(!newUser.getPassword().equals(newUser.getConfirm())){
            result.rejectValue("password", "Password", "passwords must match");
        }

        
        // Return null if result has errors
        if(result.hasErrors()){
            return null;
        }
    
        // Hash and set password, save user to database
        String hasedPW = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hasedPW);

        User user = userRepository.save(newUser);

        return user;
    }



    public User login(LoginUser newLoginObject, BindingResult result) {
        
        // Find user in the DB by email
        User user = userRepository.findByEmail(newLoginObject.getEmail()).orElse(null);
        // Reject if NOT present
        if(user == null){
            result.rejectValue("email", "EmailLogin", "Invalid Credentials");
        
        }
        
        // Reject if BCrypt password match fails
        else if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())){
            result.rejectValue("password", "PasswordLogin", "Invalid Credentials");
        }
    
        // Return null if result has errors
            if(result.hasErrors()){
                return null;
            }


        // Otherwise, return the user object
            return user;
    }
}
