package co.tylermaxwell.recipes.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.recipes.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{
    List<Recipe> findAll();
    
}
