package com.groc.recipes.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "recipes")
public class Recipe {

    @Id
    private String id;
    private String token;
    private String description;
    private Object ingredients;
    private Object steps;
    private Object picture;
    private Object timeToCook;
    private Object nutritionalDetails;
    private String name;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getIngredients() {
        return ingredients;
    }

    public void setIngredients(Object ingredients) {
        this.ingredients = ingredients;
    }

    public Object getSteps() {
        return steps;
    }

    public void setSteps(Object steps) {
        this.steps = steps;
    }

    public Object getPicture() {
        return picture;
    }

    public void setPicture(Object picture) {
        this.picture = picture;
    }

    public Object getTimeToCook() {
        return timeToCook;
    }

    public void setTimeToCook(Object timeToCook) {
        this.timeToCook = timeToCook;
    }

    public Object getNutritionalDetails() {
        return nutritionalDetails;
    }

    public void setNutritionalDetails(Object nutritionalDetails) {
        this.nutritionalDetails = nutritionalDetails;
    }
}
