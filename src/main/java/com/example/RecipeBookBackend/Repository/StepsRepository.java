package com.example.RecipeBookBackend.Repository;

import com.example.RecipeBookBackend.Model.Steps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StepsRepository extends JpaRepository<Steps, Long> {

    //READ
    @Query(value = "SELECT * FROM steps", nativeQuery = true)
    List<Steps> getAllSteps();
}
