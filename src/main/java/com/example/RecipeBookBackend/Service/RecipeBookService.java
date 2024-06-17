package com.example.RecipeBookBackend.Service;

import com.example.RecipeBookBackend.Exceptions.RecipeNotFoundException;
import com.example.RecipeBookBackend.Model.Recipe;
import com.example.RecipeBookBackend.Model.Steps;
import com.example.RecipeBookBackend.Repository.RecipeBookRepository;
import com.example.RecipeBookBackend.Repository.StepsRepository;
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

    @Autowired
    StepsRepository stepsRepository;

    //CREATE
    public void addRecipe(Recipe recipe) {
        recipeBookRepository.save(recipe);
    }

    public void addSteps(List<Steps> steps) {
        stepsRepository.saveAll(steps);
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
            throw new RecipeNotFoundException();
        }

        return recipe.get();
    }

    public Long getLastRecipeID() {
        return recipeBookRepository.getLastRecipeID();
    }

    public List<String> getIngredientsByID(long id) {
        return recipeBookRepository.getIngredientsByID(id);
    }

    public List<String> getStepsByID(long id) {
        return recipeBookRepository.getStepsByID(id);
    }

    //UPDATE
    public void updateRecipe(Recipe newRecipe, long id) {
        if(!recipeBookRepository.existsById(id)) {
            throw new RecipeNotFoundException();
        }

        newRecipe.setId(id);

        recipeBookRepository.save(newRecipe);
    }

    //DELETE
    @Transactional
    public void deleteRecipe(long id) {
        if(!recipeBookRepository.existsById(id)) {
            throw new RecipeNotFoundException();
        }

        recipeBookRepository.deleteRecipeByid(id);
    }
}
