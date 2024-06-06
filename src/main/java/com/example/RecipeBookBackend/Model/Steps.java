package com.example.RecipeBookBackend.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "steps")
public class Steps {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int stepNumber;
    private String step;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

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

    public int getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }
}
