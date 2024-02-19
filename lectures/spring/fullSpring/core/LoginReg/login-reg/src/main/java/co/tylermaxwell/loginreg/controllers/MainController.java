package co.tylermaxwell.loginreg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;


@Controller
public class MainController {
    
    @GetMapping("/home")
    public String home(HttpSession session) {
        if(session.getAttribute("userId") == null){
            return "redirect:/logout";
        }
        return "home.jsp";

    }
    
}
