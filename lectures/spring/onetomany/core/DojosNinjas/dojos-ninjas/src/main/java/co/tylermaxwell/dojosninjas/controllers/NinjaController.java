package co.tylermaxwell.dojosninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import co.tylermaxwell.dojosninjas.models.Dojo;
import co.tylermaxwell.dojosninjas.models.Ninja;
import co.tylermaxwell.dojosninjas.services.DojoService;
import co.tylermaxwell.dojosninjas.services.NinjaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class NinjaController {
    
    @Autowired
    NinjaService ninjaService;

    @Autowired
    DojoService dojoService;

    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute Ninja ninja, Model model) {
        List<Dojo> dojos = dojoService.getAllDojos();
        System.out.println(dojos);
        model.addAttribute("dojos", dojos);
        return "ninjas/index.jsp";
    }

    @PostMapping("/ninjas/create")
    public String postMethodName(Ninja ninja) {
        ninjaService.createNinja(ninja);
        return String.format("redirect:/dojos/%d", ninja.getDojo().getId());
        
    }
    
    
}
