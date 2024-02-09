package co.tylermaxwell.jspdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainController {
    
    @GetMapping("/")
    public String index() {
        return "demo.jsp";
    }
    
}
