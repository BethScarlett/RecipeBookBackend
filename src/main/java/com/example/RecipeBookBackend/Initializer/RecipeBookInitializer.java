package com.example.RecipeBookBackend.Initializer;

import com.example.RecipeBookBackend.Repository.RecipeBookRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RecipeBookInitializer {
    private final RecipeBookRepository recipeBookRepository;

    @Autowired
    public RecipeBookInitializer(RecipeBookRepository recipeBookRepository) {
        this.recipeBookRepository = recipeBookRepository;
    }


}
