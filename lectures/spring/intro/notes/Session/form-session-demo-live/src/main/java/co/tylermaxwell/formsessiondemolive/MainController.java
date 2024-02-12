package co.tylermaxwell.formsessiondemolive;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MainController {


    @GetMapping(value={"/", ""})
    public String getMethodName(HttpSession session) {
        session.setAttribute("secret", "joe is awesome");
        return "index.jsp";
    }

    @PostMapping("/things/new")
    public String addThing(Thing thing, HttpSession session) {
        System.out.println(thing);
        session.setAttribute("thing", thing);
        return "redirect:/show";
    }

    @GetMapping("/show")
    public String show() {
        return "show.jsp";
    }
    
    
    
    
}
