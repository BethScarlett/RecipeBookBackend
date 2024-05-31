package com.example.RecipeBookBackend.Controller;

import com.example.RecipeBookBackend.Model.Recipe;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeBookController {
    //This is where the endpoints will go

    //GET
    //Get a recipe
    @GetMapping("/recipe")
    public Recipe getRecipe() {
        return null;
    }

    //Get all recipes
    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes() {
        return null;
    }

    //Get recipe by id
    @GetMapping("/recipe/{id}")
    public Recipe getRecipeByID(@RequestParam (required = false) int id) {
        return null;
    }

    //POST
    //Create recipe
    @PostMapping("/recipe")
    public String createRecipe(@RequestBody Recipe recipe) {
        return " ";
    }

    //UPDATE
    //Update existing recipe
    @PutMapping("/recipe")
    public Recipe updateRecipe() {
        return null;
    }

    //DELETE
    //Remove existing recipe
    @DeleteMapping("/recipe")
    public String deleteRecipe() {
        return " ";
    }
}
