package co.tylermaxwell.dojosninjaslive.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import co.tylermaxwell.dojosninjaslive.models.Dojo;
import co.tylermaxwell.dojosninjaslive.services.DojoService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class DojoController {

    @Autowired
    DojoService dojoService;

    @GetMapping(value={"", "/", "/dojos/new"})
    public String newDojo(@ModelAttribute Dojo dojo) {
        return "dojos/new.jsp";
    }

    @PostMapping("/dojos/create")
    public String createDojo(Dojo dojo) {
        Dojo newDojo = dojoService.addDojoToDB(dojo);
        
        return String.format("redirect:/dojos/%d", newDojo.getId());
    }

    @GetMapping("/dojos/{id}")
    public String showDojo(@PathVariable Long id, Model model) {
        Dojo dojo = dojoService.findDojoById(id);
        model.addAttribute("dojo", dojo);
        return "dojos/show.jsp";
    }
    
    
    
    
}
