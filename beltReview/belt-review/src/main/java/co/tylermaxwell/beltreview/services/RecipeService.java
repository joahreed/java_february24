package co.tylermaxwell.beltreview.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.beltreview.models.Recipe;
import co.tylermaxwell.beltreview.repositories.RecipeRepository;

@Service
public class RecipeService {
    
    @Autowired
    private RecipeRepository recipeRepository;

    public void saveRecipeToDB(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    public Recipe getOneRecipeById(Long id) {
        return recipeRepository.findById(id).orElse(null);
    }

    public void updateRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
    }


}
