package co.tylermaxwell.recipesdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.tylermaxwell.recipesdemo.models.Recipe;
import co.tylermaxwell.recipesdemo.repositories.RecipeRepository;
import co.tylermaxwell.recipesdemo.services.RecipeService;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/api")
public class RecipeApiController {
    
    @Autowired
    RecipeService recipeService;

    //! Create

    @PostMapping("/recipes/new")
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return recipeService.createNewRecipe(recipe);  
    }
    
    //! Read/Retrieve all
    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }
    

    //! Read/Retrieve one

    @GetMapping("/recipes/{id}")
    public Recipe getOneRecipe(@PathVariable("id") Long id) {
       return recipeService.getOneRecipeById(id);
    }
    
    
    //! Update
    @PutMapping("recipes/{id}")
    public Recipe updateRecipe(@PathVariable Long id, @RequestBody Recipe recipe) {
       return recipeService.updateRecipeById(id, recipe);
    }


    //! Delete
    @DeleteMapping("/recipes/{id}")
    public void destroyRecipe(@PathVariable("id") Long id){
        recipeService.destroyRecipeById(id);
    }
 
}
