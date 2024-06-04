package com.example.RecipeBookBackend.Service;

import com.example.RecipeBookBackend.Model.Recipe;
import com.example.RecipeBookBackend.Repository.RecipeBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeBookService {
    //Data cleansing/filitering will be done here

    @Autowired
    RecipeBookRepository recipeBookRepository;

    public List<Recipe> getAllRecipes() {
        return recipeBookRepository.getAllRecipes();
    }

}
