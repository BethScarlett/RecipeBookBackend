package com.example.RecipeBookBackend.Model;

import java.util.List;

public class Recipe {

    private int id;
    private String img;
    private String name;
    private String madeBy;
    private String desc;
    private List<String> ingredients;
    private String category;
    private List<String> suitableFor;

    public Recipe() {

    }

    public Recipe(int id, String img, String name, String madeBy, String desc, List<String> ingredients, String category, List<String> suitableFor) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.madeBy = madeBy;
        this.desc = desc;
        this.ingredients = ingredients;
        this.category = category;
        this.suitableFor = suitableFor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDescription() {
        return desc;
    }

    public void setDescription(String desc) {
        this.desc = desc;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
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
