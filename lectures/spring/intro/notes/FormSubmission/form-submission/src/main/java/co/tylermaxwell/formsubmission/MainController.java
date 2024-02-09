package co.tylermaxwell.formsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class MainController {
    
    @GetMapping("/")
    public String index() {
        return "index.jsp";
    }

    @PostMapping("/routeForForm")
    public String formRoute(Thing thing) {
        System.out.println(thing);
        return "redirect:/";
    }
    
    
}
