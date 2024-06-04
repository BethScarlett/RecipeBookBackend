package com.example.RecipeBookBackend.Repository;

import com.example.RecipeBookBackend.Model.Recipe;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RecipeBookRepository {
    //This is where data is retrieved from the database

    List<Recipe> recipes = new ArrayList<>();

    public void addRecipe (Recipe recipe) {
        recipes.add(recipe);
    }

    public List<Recipe> getAllRecipes() {
        return recipes;
    }
}
