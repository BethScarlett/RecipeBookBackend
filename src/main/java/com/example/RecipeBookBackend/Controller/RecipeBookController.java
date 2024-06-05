package com.example.RecipeBookBackend.Controller;

import com.example.RecipeBookBackend.Model.Recipe;
import com.example.RecipeBookBackend.Service.RecipeBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
public class RecipeBookController {
    //This is where the endpoints will go

    @Autowired
    RecipeBookService recipeBookService;

    //CREATE

    //Create recipe
    @PostMapping("/recipe")
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        recipeBookService.addRecipe(recipe);
        return recipe;
    }

    //READ

    //Get all recipes or by category
    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes(@RequestParam(required = false) String category) {
        if (category != null) {
            return recipeBookService.getRecipesByCategory(category);
        }

        return recipeBookService.getAllRecipes();
    }

    //Get recipe by id
    @GetMapping("/recipes/{id}")
    public Recipe getRecipeByID(@PathVariable long id) {
        return recipeBookService.getRecipeByID(id);
    }

    //UPDATE

    //Update existing recipe
    @PutMapping("/recipe/{id}")
    public Recipe updateRecipe(@RequestBody Recipe newRecipe, @PathVariable long id) {
        recipeBookService.updateRecipe(newRecipe, id);
        return newRecipe;
    }

    //DELETE

    //Remove existing recipe
    @DeleteMapping("/recipe/{id}")
    public String deleteRecipe(@PathVariable long id) {
        recipeBookService.deleteRecipe(id);
        return "Recipe removed";
    }
}
