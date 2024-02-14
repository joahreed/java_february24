package co.tylermaxwell.recipes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.recipes.models.Recipe;
import co.tylermaxwell.recipes.repositories.RecipeRepository;

@Service
public class RecipeService {
    
    
    @Autowired
    RecipeRepository recipeRepository;
    
    //! CREATE
    public Recipe CreateRecipe(Recipe recipe) {
            return recipeRepository.save(recipe);
        }

    //!  READ ALL
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    //! READ ONE
    public Recipe getOneRecipe(Long id) {
        Recipe recipe = recipeRepository.findById(id).orElse(null);
        return recipe;
    }

    //! UPDATE
    public Recipe updateRecipeById(Long id, Recipe recipe) {
        Recipe recipeOld = recipeRepository.findById(id).orElse(null);
        recipeOld.setDescription(recipe.getDescription());
        recipeOld.setName(recipe.getName());
        return recipeRepository.save(recipeOld);
    }

    //! DELETE
    public void destroyRecipe(Long id) {
        recipeRepository.deleteById(id);
    }


}
