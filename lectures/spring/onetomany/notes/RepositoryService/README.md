# [Repository and Service](https://login.codingdojo.com/m/315/9537/64345)

## Repository

```java

// .. imports .. //
    
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
    Optional<User> findByEmail(String email);
    
}
```


## Service

```java

import java.util.Optional;
    
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
    
import com.authentication.models.LoginUser;
import com.authentication.models.User;
import com.authentication.repositories.UserRepository;
    
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    

    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
        // TO-DO: Additional validations!
        // TO-DO - Reject values or register if no errors:
        
        // Reject if email is taken (present in database)
        // Reject if password doesn't match confirmation
        
        // Return null if result has errors
        return null;
    
        // Hash and set password, save user to database4444
    }


    public User login(LoginUser newLoginObject, BindingResult result) {
        // TO-DO: Additional validations!
        // TO-DO - Reject values:
        
    	// Find user in the DB by email
        // Reject if NOT present
        
        // Reject if BCrypt password match fails
    
        // Return null if result has errors
        return null;
        // Otherwise, return the user object444

    }
}

```