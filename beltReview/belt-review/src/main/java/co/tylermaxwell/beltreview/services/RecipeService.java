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


    @SuppressWarnings("null")
    public void createNewRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    public List<Recipe> getAllRecipesFromDB() {
        return recipeRepository.findAll();
    }

    @SuppressWarnings("null")
    public Recipe getOneRecipeById(Long id) {
        return recipeRepository.findById(id).orElse(null);
    }

    @SuppressWarnings("null")
    public void updateRecipeInDB(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    @SuppressWarnings("null")
    public void destroyRecipeByID(Long id) {
        recipeRepository.deleteById(id);
    }
    
}

// https://www.baeldung.com/java-unchecked-conversion re warning suppression