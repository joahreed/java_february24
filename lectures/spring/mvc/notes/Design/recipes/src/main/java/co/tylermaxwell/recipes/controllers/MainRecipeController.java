package co.tylermaxwell.recipes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import co.tylermaxwell.recipes.models.Recipe;
import co.tylermaxwell.recipes.services.RecipeService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainRecipeController {

    @Autowired
    RecipeService recipeService;

    //! CREATE

    @GetMapping("/recipes/new")
    public String getMethodName(@ModelAttribute Recipe recipe) {
        return "new.jsp";
    }
    

    @PostMapping("/recipes/create")
    public String CreateRecipe(Recipe recipe) { 
        recipeService.CreateRecipe(recipe);
        return "redirect:/recipes";
    }

    //! READ ALL

    @GetMapping("/recipes")
    public String getAllRecipes(Model model) {
        List<Recipe> recipes = recipeService.getAllRecipes();
        model.addAttribute("recipes", recipes);
        return "recipes.jsp";
    }
    

    //! READ ONE

    @GetMapping("/recipes/{id}")
    public String getOneRecipe(@PathVariable("id") Long id, Model model){
        Recipe recipe = recipeService.getOneRecipe(id);
        model.addAttribute("recipe", recipe);
        return "show.jsp";
        
    }
    
    //! UPDATE
    
    @GetMapping("/recipes/edit/{id}")
    public String editRecipeForm(@PathVariable Long id, Model model) {
        Recipe recipe = recipeService.getOneRecipe(id);
        model.addAttribute("recipe", recipe);
        return "edit.jsp";
    }
    

    @PutMapping("recipes/{id}")
    public String updateRecipe(@PathVariable Long id, @ModelAttribute Recipe recipe) {
        recipeService.updateRecipe(recipe);
        return "redirect:/recipes";   
    }

    //! DELETE
    @DeleteMapping("/recipes/{id}")
    public String deleteRecipe(@PathVariable Long id){
        recipeService.destroyRecipe(id);
        return "redirect:/recipes";
    }
    
}
