package co.tylermaxwell.fruityloops;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {

        ArrayList<Item> fruits = new ArrayList<Item>();
        fruits.add(new Item("Kiwi", 1.5));
        fruits.add(new Item("Mango", 2.0));
        fruits.add(new Item("Goji Berries", 4.0));
        fruits.add(new Item("Guava", .75));
        System.out.println(fruits);
        
        // Add fruits to your view model here
        model.addAttribute("fruits", fruits);

        return "index.jsp";
    }
    
    
    
}


        



