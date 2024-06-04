package com.example.RecipeBookBackend.Model;

import java.util.List;

public class Recipe {

    private long id;
    private String img;
    private String name;
    private String madeBy;
    private String desc;
    private List<String> ingredients;
    private List<String> steps;
    private String category;
    private List<String> suitableFor;

    public Recipe() {

    }

    public Recipe(long id, String img, String name, String madeBy, String desc, List<String> ingredients, List<String> steps, String category, List<String> suitableFor) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.madeBy = madeBy;
        this.desc = desc;
        this.ingredients = ingredients;
        this.steps = steps;
        this.category = category;
        this.suitableFor = suitableFor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getSuitableFor() {
        return suitableFor;
    }

    public void setSuitableFor(List<String> suitableFor) {
        this.suitableFor = suitableFor;
    }
}
