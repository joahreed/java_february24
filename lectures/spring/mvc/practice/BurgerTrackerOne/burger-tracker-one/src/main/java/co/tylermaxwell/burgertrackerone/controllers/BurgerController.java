package co.tylermaxwell.burgertrackerone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import co.tylermaxwell.burgertrackerone.models.Burger;
import co.tylermaxwell.burgertrackerone.services.BurgerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



//TODO:  Remember the @Controller annotation
@Controller
public class BurgerController {

    //TODO connect to the Burger Service
    @Autowired
    BurgerService burgerService;

    //TODO:  Create a route to render index.jsp and just test that it renders. Add the @ModelAttribute annotation and associated syntax to your render route to bind an empty Burger object to the JSP form and capture the user input.

    @GetMapping("/")
    public String index(@ModelAttribute Burger burger, Model model) {
        List<Burger> burgers = burgerService.getAllBurgers();
        System.out.println(burgers);
        model.addAttribute("burgers", burgers);
        return "index.jsp";
    }
    

    //TODO: Add a POST route to process the form and add a new burger to the database. The @ModelAttribute annotation will be used to receive the filled Burger object. 
    //TODO add annotations for validations two 
    @PostMapping("/burgers/create")
    public String createBurgerHandler(@ModelAttribute Burger burger) {
        System.out.println(burger);
        burgerService.saveBurgerToDatabase(burger);
        return "redirect:/";
    }
    
    
    //TODO: Be sure the POST route redirects to the render route after creating the new burger.
    
}
