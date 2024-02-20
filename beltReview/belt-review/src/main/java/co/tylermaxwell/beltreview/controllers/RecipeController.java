package co.tylermaxwell.beltreview.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import co.tylermaxwell.beltreview.models.Recipe;
import co.tylermaxwell.beltreview.services.RecipeService;
import jakarta.validation.Valid;






@Controller
public class RecipeController {

    /**
     * Connect to recipe service
     */
    @Autowired
    RecipeService recipeService;

    
    //! CREATE
    /**
     * display a form to create a recipe
     * @param recipe
     * @return
     */
    @GetMapping("/recipes/new")
    public String newRecipe(@ModelAttribute Recipe recipe) {
        return "recipes/new";
    }
    
    /**
     * handle form data for recipe creation
     * @param recipe
     * @return
     */
    @PostMapping("/recipes")
    public String createRecipe(@Valid Recipe recipe, BindingResult result) {
        if(result.hasErrors()){
            return "recipes/new";
        }
        recipeService.saveRecipeToDB(recipe);
        return "redirect:/recipes";
    }
    
    
    //! READ ALL
    /**
     * Display all recipes
     * @param model
     * @return
     */
    @GetMapping("/recipes")
    public String indexRecipes(Model model) {
        List<Recipe> recipes = recipeService.getAllRecipes();
        model.addAttribute("recipes", recipes);
        return "recipes/index";
    }

    //! READ ONE

    /**
     * show one 
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/recipes/{id}")
    public String showRecipe(@PathVariable Long id, Model model) {
        Recipe recipe = recipeService.getOneRecipeById(id);
        model.addAttribute("recipe", recipe);
        return "recipes/show";
    }
    
    //! UPDATE
    
    @GetMapping("/recipes/edit/{id}")
    public String editRecipe(@PathVariable Long id, Model model) {
        Recipe recipe = recipeService.getOneRecipeById(id);
        model.addAttribute("recipe", recipe);
        return "recipes/edit";
    }

    @PutMapping("recipes/{id}")
    public String updateRecipe(@Valid Recipe recipe, BindingResult result) {
        if(result.hasErrors()){
            return "recipes/edit";
        }
        recipeService.updateRecipe(recipe);
        return "redirect:/recipes";
    }
    

    //! DELETE
    
    
}
