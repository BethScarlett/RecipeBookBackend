package com.example.RecipeBookBackend.Service;

import com.example.RecipeBookBackend.Model.Recipe;
import com.example.RecipeBookBackend.Repository.RecipeBookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeBookService {
    //Data cleansing/filitering will be done here

    @Autowired
    RecipeBookRepository recipeBookRepository;

    //CREATE
    public void addRecipe(Recipe recipe) {
        recipeBookRepository.save(recipe);
    }

    //READ
    public List<Recipe> getAllRecipes() {
        return recipeBookRepository.getAllRecipes();
    }

    public List<Recipe> getRecipesByCategory(String category) {
         return recipeBookRepository.getAllByCategory(category);
    }

    public Recipe getRecipeByID(long id) {
        Optional<Recipe> recipe = recipeBookRepository.findById(id);

        if(recipe.isEmpty()) {
            throw new Error();
        }

        return recipe.get();
    }

    //UPDATE
    public void updateRecipe(Recipe newRecipe, long id) {
        if(!recipeBookRepository.existsById(id)) {
            throw new Error();
        }

        newRecipe.setId(id);

        recipeBookRepository.save(newRecipe);
    }

    //DELETE
    @Transactional
    public void deleteRecipe(long id) {
        recipeBookRepository.deleteRecipeByid(id);
    }
}
