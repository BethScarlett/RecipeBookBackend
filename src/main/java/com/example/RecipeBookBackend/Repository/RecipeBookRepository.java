package com.example.RecipeBookBackend.Repository;

import com.example.RecipeBookBackend.Model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeBookRepository extends JpaRepository<Recipe, Long> {

    //READ
    @Query(value = "SELECT * FROM recipe", nativeQuery = true)
    List<Recipe> getAllRecipes();

    List<Recipe> getAllByCategory(String category);

    @Query(value = "SELECT ingredient.name FROM ingredient WHERE recipe_id = ?1", nativeQuery = true)
    List<String> getIngredientsByID(long id);

    @Query(value = "SELECT steps.step FROM steps WHERE recipe_id = ?1", nativeQuery = true)
    List<String> getStepsByID(long id);

    //DELETE
    void deleteRecipeByid(long id);
}
