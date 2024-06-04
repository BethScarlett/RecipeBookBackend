package com.example.RecipeBookBackend.Controller;

import com.example.RecipeBookBackend.Model.Recipe;
import com.example.RecipeBookBackend.Service.RecipeBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5174/")
public class RecipeBookController {
    //This is where the endpoints will go

    @Autowired
    RecipeBookService recipeBookService;

    //GET
    //Get a recipe
    @GetMapping("/recipe")
    public Recipe getRecipe() {
        return null;
    }

    //Get all recipes
    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes() {
        return recipeBookService.getAllRecipes();
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
