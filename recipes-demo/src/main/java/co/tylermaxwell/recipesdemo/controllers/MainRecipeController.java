package co.tylermaxwell.recipesdemo.controllers;

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

import co.tylermaxwell.recipesdemo.models.Recipe;
import co.tylermaxwell.recipesdemo.services.RecipeService;
import jakarta.validation.Valid;





@Controller
public class MainRecipeController {

    @Autowired
    RecipeService recipeService;
    

    //!CREATE

    @GetMapping("/recipes/new")
    public String newRecipeForm(@ModelAttribute Recipe recipe) {
        return "new.jsp";
    }

    @PostMapping("/recipes/create")
    public String createRecipeHandler(@Valid Recipe recipe, BindingResult result) {
        System.out.println(result.hasErrors());
        if(result.hasErrors()){
            return "new.jsp";
        }
        System.out.println(recipe);
        recipeService.createNewRecipe(recipe);
        return "redirect:/recipes";
    }
    


    //! READ ALL

    @GetMapping("/recipes")
    public String recipesTemplate(Model model) {
        List<Recipe> recipes = recipeService.getAllRecipes();
        System.out.println(recipes);
        model.addAttribute("recipes", recipes);
        return "index.jsp";
    }
    
    //! READ ONE

    @GetMapping("/recipes/{id}")
    public String showRecipe(@PathVariable("id") Long id, Model model) {
        Recipe recipe = recipeService.getOneRecipeById(id);
        model.addAttribute("recipe", recipe);
        return "show.jsp";
    }
    
    
    //!UPDATE
    
    @GetMapping("/recipes/edit/{id}")
    public String editRecipeForm(@PathVariable("id") Long id, Model model) {
        Recipe recipe = recipeService.getOneRecipeById(id);
        model.addAttribute("recipe", recipe);
        return "edit.jsp";
    }

    @PutMapping("recipes/{id}")
    public String updateRecipeHandler(@Valid @ModelAttribute Recipe recipe, BindingResult result, @PathVariable Long id) {
        if(result.hasErrors()){
            return "edit.jsp";
        }
        recipeService.updateRecipe(recipe);
        return "redirect:/recipes";
    }



    //!DELETE

    @DeleteMapping("/recipes/{id}")
    public String destroyRecipe(@PathVariable Long id){
        recipeService.destroyRecipeById(id);
        return "redirect:/recipes";
    }
}
