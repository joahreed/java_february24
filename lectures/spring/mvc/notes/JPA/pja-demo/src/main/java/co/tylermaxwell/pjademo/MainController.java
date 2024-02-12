package co.tylermaxwell.pjademo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class MainController {

    @Autowired ThingRepository thingRepository;
    

    @GetMapping("/")
    public String index(Model model) {
        List<Thing> things = thingRepository.findAll();
        model.addAttribute("things", things);
        return "index.jsp";
    }

    @PostMapping("/things/add")
    public String add(Thing thing) {
        thingRepository.save(thing);
        return "redirect:/";
    }
    
    
}
