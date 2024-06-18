package com.example.RecipeBookBackend.Repository;

import com.example.RecipeBookBackend.Model.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientsRepository extends JpaRepository<Ingredients, Long> {

    //READ
    @Query(value = "SELECT * FROM ingredient", nativeQuery = true)
    List<Ingredients> getAllIngredients();

    //DELETE
    void deleteIngredientsByid(long id);
}
