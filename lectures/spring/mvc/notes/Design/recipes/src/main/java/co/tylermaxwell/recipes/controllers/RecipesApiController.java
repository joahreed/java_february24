package co.tylermaxwell.recipes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.tylermaxwell.recipes.models.Recipe;
import co.tylermaxwell.recipes.services.RecipeService;




@RestController
@RequestMapping("/api")
public class RecipesApiController {

    @Autowired
    RecipeService recipeService;

    //! CREATE

    @PostMapping("/recipes/new")
    public Recipe CreateRecipe(@RequestBody Recipe recipe) { 
        return recipeService.CreateRecipe(recipe);
    }

    //! READ ALL

    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
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


    // //! CREATE

    // @PostMapping("/recipes/new")
    // public Recipe CreateRecipe(@RequestBody Recipe recipe) { 
    //     return recipeRepository.save(recipe);
    // }

    // //! READ ALL

    // @GetMapping("/recipes")
    // public List<Recipe> getAllRecipes() {
    //     return recipeRepository.findAll();
    // }
    

    // //! READ ONE

    // @GetMapping("/recipes/{id}")
    // public Recipe getOneRecipe(@PathVariable("id") Long id){
    //     Recipe recipe = recipeRepository.findById(id).orElse(null);
    //     return recipe;
        
    // }
    
    // //! UPDATE
    // @PutMapping("recipes/{id}")
    // public Recipe updateRecipe(@PathVariable Long id, @RequestBody Recipe recipe) {
    //     Recipe recipeOld = recipeRepository.findById(id).orElse(null);
    //     recipeOld.setDescription(recipe.getDescription());
    //     recipeOld.setName(recipe.getName());
    //     return recipeRepository.save(recipeOld);
        
    // }

    // //! DELETE
    // @DeleteMapping("/recipes/{id}")
    // public void deleteRecipe(@PathVariable Long id){
    //     recipeRepository.deleteById(id);
    // }
    
}
