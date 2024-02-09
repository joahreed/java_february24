package co.tylermaxwell.routingdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/tylersroutes")
public class MainController {
    
    @GetMapping("/")
    public String index() {
        return "Hello from the controller";
    }

    @GetMapping("/new")
    public String newRoute() {
        return "This is the new route";
    }

    @GetMapping("/{variable}")
    public String variableRoute(@PathVariable("variable") String variable) {
        if(variable.equals("tyler")){
            return String.format("%s is cool", variable);
        } else {
            return "Something else";
        }
    }

    @GetMapping("/{variable}/{num}")
    public String variableRoute(@PathVariable("variable") String variable, @PathVariable("num") int num) {
        if(num % 2 == 0){
            return "The number " + num + " is even!";
        } else {
            return "The number " + num + " is odd!";
        }
    }
    
    
    

}
