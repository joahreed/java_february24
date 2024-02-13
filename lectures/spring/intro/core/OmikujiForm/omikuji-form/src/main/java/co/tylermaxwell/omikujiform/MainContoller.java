package co.tylermaxwell.omikujiform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class MainContoller {
    
    @GetMapping("/")
    public String index() {
        return "index.jsp";
    }

    @PostMapping("/omikuji/new")
    public String create(Omikuji omikuji) {
        
        return "redirect:/show";
    }
    
    
}
