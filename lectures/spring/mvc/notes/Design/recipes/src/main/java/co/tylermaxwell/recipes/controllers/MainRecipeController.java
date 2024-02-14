package co.tylermaxwell.recipes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @GetMapping("/recipes/create")
    public String getMethodName(@ModelAttribute Recipe recipe) {
        return "new.jsp";
    }
    

    @PostMapping("/recipes/new")
    public String CreateRecipe(Recipe recipe) { 
        recipeService.CreateRecipe(recipe);
        return "redirect:/recipes";
    }

    //! READ ALL

    @GetMapping("/recipes")
    public String getAllRecipes() {
        List<Recipe> recipes = recipeService.getAllRecipes();
        return "recipes.jsp";
    }
    

    //! READ ONE

    @GetMapping("/recipes/{id}")
    public Recipe getOneRecipe(@PathVariable("id") Long id){
        return recipeService.getOneRecipe(id);   
    }
    
    //! UPDATE
    @PutMapping("recipes/{id}")
    public Recipe updateRecipe(@PathVariable Long id, @RequestBody Recipe recipe) {
        return recipeService.updateRecipeById(id, recipe);   
    }

    //! DELETE
    @DeleteMapping("/recipes/{id}")
    public void deleteRecipe(@PathVariable Long id){
        recipeService.destroyRecipe(id);
    }
    
}
