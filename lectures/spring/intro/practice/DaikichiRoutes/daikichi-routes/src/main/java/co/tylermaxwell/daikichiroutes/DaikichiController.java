package co.tylermaxwell.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

    @GetMapping("")
    public String index() {
        return new String("Welcome!");
    }

    @GetMapping("/today")
    public String today() {
        return new String("Today you will find luck in all your endeavors!");
    }
    
    

    @GetMapping("/tomorrow")
    public String tomorrow() {
        return new String("Tomorrow, an opportunity will arise, so be sure to be open to new ideas!");
    }
    
    
}
