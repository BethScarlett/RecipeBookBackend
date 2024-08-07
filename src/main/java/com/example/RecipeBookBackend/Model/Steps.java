package com.example.RecipeBookBackend.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "steps")
public class Steps {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long stepNumber;
    private String step;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Steps() {

    }

    public Steps(long id, int stepNumber, String step) {
        this.id = id;
        this.stepNumber = stepNumber;
        this.step = step;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(long stepNumber) {
        this.stepNumber = stepNumber;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }
}
