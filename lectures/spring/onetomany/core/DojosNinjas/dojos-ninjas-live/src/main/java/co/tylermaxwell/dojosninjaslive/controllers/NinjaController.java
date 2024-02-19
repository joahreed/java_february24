package co.tylermaxwell.dojosninjaslive.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import co.tylermaxwell.dojosninjaslive.models.Dojo;
import co.tylermaxwell.dojosninjaslive.models.Ninja;
import co.tylermaxwell.dojosninjaslive.services.DojoService;
import co.tylermaxwell.dojosninjaslive.services.NinjaService;


@Controller
public class NinjaController {

    @Autowired
    NinjaService ninjaService;

    @Autowired
    DojoService dojoService;

    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute Ninja ninja, Model model) {
        List<Dojo> dojos = dojoService.getAllDojos();
        model.addAttribute("dojos", dojos);
        return "ninjas/new.jsp";
    }
    
    
}
