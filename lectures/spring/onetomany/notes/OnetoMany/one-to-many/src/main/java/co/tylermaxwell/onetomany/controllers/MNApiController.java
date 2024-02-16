package co.tylermaxwell.onetomany.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MNApiController {

    @GetMapping("/")
    public One getOnesManys() {
        return new String();
    }
    
    
}
