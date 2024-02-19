package co.tylermaxwell.dojosninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.tylermaxwell.dojosninjas.models.Dojo;
import co.tylermaxwell.dojosninjas.services.DojoService;





@Controller
public class DojoController {
    
    @Autowired
    DojoService dojoService;

    @GetMapping(value={"", "/", "/dojos/new"})
    public String dojoIndex(@ModelAttribute Dojo dojo) {
        return "dojos/index.jsp";
    }

    @PostMapping("/dojos/create")
    public String createDojo(Dojo dojo) {
        Dojo newDojo = dojoService.createDojo(dojo);
        return String.format("redirect:/dojos/%d", newDojo.getId());
    }

    @GetMapping("/dojos/{id}")
    public String getMethodName(@PathVariable Long id, Model model) {
        Dojo dojo = dojoService.getOneDojoById(id);
        model.addAttribute("dojo", dojo);
        return "dojos/show.jsp";
    }
    
    


    
}
