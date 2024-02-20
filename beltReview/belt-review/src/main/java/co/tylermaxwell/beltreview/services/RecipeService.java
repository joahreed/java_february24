package co.tylermaxwell.beltreview.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.beltreview.models.Recipe;
import co.tylermaxwell.beltreview.repositories.RecipeRepository;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public void createNewRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
    }
    
}
