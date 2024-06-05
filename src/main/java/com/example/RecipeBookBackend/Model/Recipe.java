package com.example.RecipeBookBackend.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String img;
    private String name;
    private String description;
    private String category;

    public Recipe() {

    }

    //TODO - Add all back when issue is found
    public Recipe(long id, String img, String name, String description, String category) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.description = description;
        this.category = category;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
