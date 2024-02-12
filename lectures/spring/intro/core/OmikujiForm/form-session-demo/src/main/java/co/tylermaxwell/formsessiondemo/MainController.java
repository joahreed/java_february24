package co.tylermaxwell.formsessiondemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller

public class MainController {
    

    @GetMapping(value={"", "/"})
    public String index() {
        System.out.println("test");
        return "index.jsp";
    }

    @PostMapping("/handleForm")
    public String handleForm(Thing thing, HttpSession session) {
        System.out.println(thing);
        session.setAttribute("thing", thing);
        return "redirect:/show";

    }

    @GetMapping("/show")
    public String show() {
        return "show.jsp";
    }
    
    
    
}
