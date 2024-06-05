package com.example.RecipeBookBackend.Repository;

import com.example.RecipeBookBackend.Model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeBookRepository extends JpaRepository<Recipe, Long> {

    @Query(value = "SELECT * FROM recipe", nativeQuery = true)
    List<Recipe> getAllRecipes();
}
