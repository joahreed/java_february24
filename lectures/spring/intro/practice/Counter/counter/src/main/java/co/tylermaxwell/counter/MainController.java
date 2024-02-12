package co.tylermaxwell.counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;




@Controller
public class MainController {
    
    int count = 0;

    @GetMapping("/")
    public String index(HttpSession session) {
        if(session.getAttribute("count") == null){
            session.setAttribute("count", count);
        } else {
            session.setAttribute("count", count++);
        }
        System.out.println(count);
        return "index.jsp";
    }

    @GetMapping("/counter")
    public String counter() {
        return "index.jsp";
    }

    @GetMapping("/reset")
    public String reset(HttpSession session) {
        session.setAttribute("counter", null);
        count = 0;
        return "redirect:/";
    }
    
    
    
}
