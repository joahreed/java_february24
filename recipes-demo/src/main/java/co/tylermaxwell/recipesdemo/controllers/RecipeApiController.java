package co.tylermaxwell.recipesdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import co.tylermaxwell.recipesdemo.models.Recipe;
import co.tylermaxwell.recipesdemo.repositories.RecipeRepository;



@RestController
public class RecipeApiController {
    

    @Autowired
    RecipeRepository recipeRepository;

    //! Create

    @PostMapping("/recipes/new")
    public Recipe createRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);    
    }
    
    //! Read/Retrieve all
    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }
    


    //! Read/Retrieve one

    //! Update


    //! Delete

}
