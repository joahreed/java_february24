package co.tylermaxwell.beltreview.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import co.tylermaxwell.beltreview.models.Recipe;
import co.tylermaxwell.beltreview.services.RecipeService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;






@Controller
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    //! CREATE

    @GetMapping("/recipes/new") 
    public String newRecipe(@ModelAttribute Recipe recipe) {
        return "recipes/new";
    }
    

    @PostMapping("/recipes")
    public String createRecipe(@Valid Recipe recipe, BindingResult result) {
        if(result.hasErrors()){
            return "recipes/new";
        }
        recipeService.createNewRecipe(recipe);
        return "redirect:/recipes";
    }
    
    

    //! READ ALL

    @GetMapping("/recipes")
    public String recipeIndex(HttpSession session, Model model) {
        if(session.getAttribute("userId") == null){
            return "redirect:/logout";
        }
        List<Recipe> recipes = recipeService.getAllRecipesFromDB();
        model.addAttribute("recipes", recipes);
        return "recipes/index";
    }

    //! READ ONE

    @GetMapping("/recipes/{id}")
    public String showRecipe(@PathVariable Long id, Model model) {
        Recipe recipe = recipeService.getOneRecipeById(id);
        model.addAttribute("recipe", recipe);
        return "recipes/show";
    }
    
    //!UPDATE
    
    @GetMapping("/recipes/{id}/edit")
    public String getMethodName(@PathVariable Long id, Model model) {
        Recipe recipe = recipeService.getOneRecipeById(id);
        model.addAttribute("recipe", recipe);
        return "recipes/edit";
    }

    @PutMapping("/recipes/{id}")
    public String updateRecipe(@Valid Recipe recipe, BindingResult result) {
        if(result.hasErrors()){
            return "recipes/edit";
        }
        recipeService.updateRecipeInDB(recipe);
        return "redirect:/recipes";
    }

    //! DELETE

    @DeleteMapping("/recipes/{id}")
    public String destroyRecipe(@PathVariable Long id){
        recipeService.destroyRecipeByID(id);
        return "redirect:/recipes";
    }
    
    
    
}
