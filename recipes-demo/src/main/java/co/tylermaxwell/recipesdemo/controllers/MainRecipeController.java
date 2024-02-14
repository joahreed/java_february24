package co.tylermaxwell.recipesdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.tylermaxwell.recipesdemo.models.Recipe;
import co.tylermaxwell.recipesdemo.services.RecipeService;


@Controller
public class MainRecipeController {

    @Autowired
    RecipeService recipeService;
    

    //!CREATE

    //! READ ALL

    @GetMapping("/recipes")
    public String recipesTemplate(Model model) {
        List<Recipe> recipes = recipeService.getAllRecipes();
        System.out.println(recipes);
        model.addAttribute("recipes", recipes);
        return "index.jsp";
    }
    

    //! READ ONE


    //!UPDATE


    //!DELETE
}
