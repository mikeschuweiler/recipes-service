package com.groc.recipes.repository;

import com.groc.recipes.model.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
public interface RecipesRepository extends MongoRepository<Recipe, String> {

    Iterable<Recipe> findAllByToken(String token);
    Iterable<Recipe> findRecipeById(String id);

}
