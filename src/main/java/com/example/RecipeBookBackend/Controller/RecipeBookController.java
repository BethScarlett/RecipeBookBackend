package com.example.RecipeBookBackend.Controller;

import com.example.RecipeBookBackend.Exceptions.RecipeNotFoundException;
import com.example.RecipeBookBackend.Model.Recipe;
import com.example.RecipeBookBackend.Model.Steps;
import com.example.RecipeBookBackend.Service.RecipeBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
public class RecipeBookController {

    @Autowired
    RecipeBookService recipeBookService;

    @ExceptionHandler
    public String handleExceptions(RecipeNotFoundException exception) {
        return exception.getMessage();
    }

    //CREATE

    //Create recipe
    @PostMapping("/recipe")
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        recipeBookService.addRecipe(recipe);
        return recipe;
    }

    @PostMapping("/steps")
    public List<Steps> createSteps(@RequestBody List<Steps> steps) {
        recipeBookService.addSteps(steps);
        return steps;
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

    //Get last recipe id
    @GetMapping("/recipe/last_id")
    public Long getLastRecipeID() {
        return recipeBookService.getLastRecipeID();
    }

    //Get recipe ingredients by id
    @GetMapping("/recipes/ingredients/{id}")
    public List<String> getIngredientsByID(@PathVariable long id) {
        return recipeBookService.getIngredientsByID(id);
    }

    //Get recipe steps by id
    @GetMapping("/recipes/steps/{id}")
    public List<String> getStepsByID(@PathVariable long id) {
        return recipeBookService.getStepsByID(id);
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
