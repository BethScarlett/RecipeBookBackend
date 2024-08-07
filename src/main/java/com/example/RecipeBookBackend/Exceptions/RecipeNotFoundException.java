package com.example.RecipeBookBackend.Exceptions;

public class RecipeNotFoundException extends RuntimeException {
    public RecipeNotFoundException() {
        super("Oops! That recipe wasn't found.");
    }
}
