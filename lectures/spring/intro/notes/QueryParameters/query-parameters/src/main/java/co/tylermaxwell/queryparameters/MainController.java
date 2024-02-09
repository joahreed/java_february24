package co.tylermaxwell.queryparameters;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MainController {
    
    @GetMapping("/")
    public String index(@RequestParam(required = false) String searchQuery) {
        return "You searched for " + searchQuery;
    }
    
}
