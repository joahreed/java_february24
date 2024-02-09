package co.tylermaxwell.jstlloops;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainController {

    ArrayList<Coffee> coffees = new ArrayList<>();

    {
        Coffee coffee1 = new Coffee("drip", 1.5);
        Coffee coffee2 = new Coffee("espresso", 2.75);
        Coffee coffee3 = new Coffee("latte", 3.5);
        Coffee coffee4 = new Coffee("mocha", 4.5);

        coffees.addAll(Arrays.asList(coffee1, coffee2, coffee3, coffee4));
    } 

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("coffees", coffees);
        return "index.jsp";
    }
    

    
}
