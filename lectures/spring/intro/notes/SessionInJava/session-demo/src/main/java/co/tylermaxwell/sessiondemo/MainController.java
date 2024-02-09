package co.tylermaxwell.sessiondemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.servlet.http.HttpSession;





@Controller
public class MainController {
    @GetMapping("/")
    public String index(HttpSession session) {
        session.setAttribute("data", "The data in session");
        return "index.jsp";
    }

    @GetMapping("/new")
    public String newSession(HttpSession session) {
        session.setAttribute("data", "Something new!!");
        return "index.jsp";
    }

    @GetMapping("/{anything}")
    public String anything(HttpSession session, @PathVariable String anything) {
        session.setAttribute("data", anything );
        return "index.jsp";
    }
    
    
    
}
