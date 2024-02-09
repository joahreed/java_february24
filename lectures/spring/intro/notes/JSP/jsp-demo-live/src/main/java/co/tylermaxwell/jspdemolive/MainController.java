package co.tylermaxwell.jspdemolive;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

    ArrayList<User> users = new ArrayList<>();

    {
        User user1 = new User("Josh Lee", "jdawg@earthlink.net");
        User user2 = new User("Josh Gallaway", "jgdawg@earthlink.net");
        User user3 = new User("Tyler Maxwell", "tdawg@earthlink.net");

        users.addAll(Arrays.asList(user1, user2, user3));
    }
    
    @GetMapping("/")
    public String index(Model model) {
        // User user = new User("Josh", "jdawg@aol.com");
        model.addAttribute("users", users);
        return "index.jsp";
    }
    
}
