package co.tylermaxwell.vscodedemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api")
public class DemoController {


    @GetMapping("/")
    public String index() {
        return new String("hello");
    }

    @GetMapping("/user")
    public User show() {
        User user = new User("josh", "jdawg@aol.com");
        return user;
    }
    
    
    
}
