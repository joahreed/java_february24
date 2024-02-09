package co.tylermaxwell.renderingdata;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
    
    @GetMapping("/")
    public String indexString(Model model) {
        User user = new User("Josh", "jdawg@earthlink.net");
        model.addAttribute("user", user);
        return "index.jsp";
    }
    
}
