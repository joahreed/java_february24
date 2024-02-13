package co.tylermaxwell.recipes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import co.tylermaxwell.recipes.models.Recipe;
import co.tylermaxwell.recipes.repositories.RecipeRepository;



@RestController
public class RecipesApiController {

    @Autowired
    RecipeRepository recipeRepository;

    //! CREATE

    @PostMapping("/recipes/new")
    public Recipe CreateRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }
    



    //! READ ALL

    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }
    

    //! READ ONE

    //! UPDATE

    //! DELETE
    
}
