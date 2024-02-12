package co.tylermaxwell.jstlconditionals;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    
    @GetMapping("/")
    public String index(Model model) {
        Random r = new Random();
        model.addAttribute("number", r.nextInt(100));
        model.addAttribute("secretNumber", r.nextInt(100));
        return "index.jsp";
    }
    
}
