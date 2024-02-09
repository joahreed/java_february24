package co.tylermaxwell.staticcontent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
    @GetMapping("/")
    public String indexString() {
        return "index.jsp";
    }
    
}
