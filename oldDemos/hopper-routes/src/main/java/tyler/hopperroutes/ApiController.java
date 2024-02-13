package tyler.hopperroutes;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/tyler")
public class ApiController {

    @GetMapping("/{variable1}/{variable2}")
    public String apiIndex(@PathVariable("variable1") String variable1, @PathVariable("variable2") String variable2) {
        if(variable1.equals("travel")){
        return "Congratulations you will soon travel to" + variable2;
    }
        return "Test string";
    
}
    
}
