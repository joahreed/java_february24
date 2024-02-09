package co.tylermaxwell.renderingdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {

    
    @GetMapping("/")
    // the Model object allows key/value pairs to be sent to the view
    public String index(Model model) {   
        model.addAttribute("programmer", "Josh");  
        return "index.jsp";
    }
    
    
}
