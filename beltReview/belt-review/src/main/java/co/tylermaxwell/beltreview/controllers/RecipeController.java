package co.tylermaxwell.beltreview.controllers;

import org.eclipse.jdt.internal.compiler.parser.RecoveredImport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import co.tylermaxwell.beltreview.models.Recipe;
import co.tylermaxwell.beltreview.services.RecipeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    //! CREATE

    @GetMapping("/recipes/new") 
    public String newRecipe(@ModelAttribute Recipe recipe) {
        return "recipes/new";
    }

    @PostMapping("/recipes")
    public String createRecipe(Recipe recipe) {
        System.out.println(recipe);
        recipeService.createNewRecipe(recipe);
        
        return "redirect:/recipes";
    }
    
    

    //! READ ALL

    @GetMapping("/recipes")
    public String recipeIndex(HttpSession session) {
        if(session.getAttribute("userId") == null){
            return "redirect:/logout";
        }

        return "recipes/index";
    }

    //! READ ONE


    //!UPDATE

    //! DELETE
    
    
}
