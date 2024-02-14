package co.tylermaxwell.recipesdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.recipesdemo.models.Recipe;
import co.tylermaxwell.recipesdemo.repositories.RecipeRepository;

@Service
public class RecipeService {

    
    @Autowired
    RecipeRepository recipeRepository;

    public Recipe createNewRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);  
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    public Recipe getOneRecipeById(Long id) {
        Recipe recipe = recipeRepository.findById(id).orElse(null);
        return recipe;
    }

    public Recipe updateRecipeById(Long id, Recipe recipe) {
        Recipe recipeOld = recipeRepository.findById(id).orElse(null);
        recipeOld.setDescription(recipe.getDescription());
        recipeOld.setName(recipe.getName());
        return recipeRepository.save(recipeOld);
    }

    public void destroyRecipeById(Long id) {
        recipeRepository.deleteById(id);
    }




    
}
