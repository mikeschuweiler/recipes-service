package com.groc.recipes.service;

import com.groc.recipes.model.Recipe;
import com.groc.recipes.repository.RecipesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipesService {

    @Autowired
    private RecipesRepository reporitory;

    public Iterable<Recipe> getAllRecipes() {
        return reporitory.findAll();
    }

    public Iterable<Recipe> createRecipe(Recipe recipe) {
        reporitory.save(recipe);
        return reporitory.findRecipeById(recipe.getId());
    }

}
