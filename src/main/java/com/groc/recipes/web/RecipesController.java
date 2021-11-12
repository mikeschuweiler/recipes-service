package com.groc.recipes.web;

import com.groc.recipes.model.Recipe;
import com.groc.recipes.service.RecipesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        path = "/api/recipes"
)
public class RecipesController {

    private static final Logger logger = LoggerFactory.getLogger(RecipesController.class);

    @Autowired
    private RecipesService recipesService;

    @RequestMapping(
            path = "/v1/get/recipes",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity<Iterable<Recipe>> getAllRecipes() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity(recipesService.getAllRecipes(), headers, HttpStatus.OK);
    }

    @RequestMapping(
            path = "/v1/create/recipe",
            method = RequestMethod.POST,
            produces = "application/json"
    )
    public ResponseEntity<Iterable<Recipe>> createRecipe(@RequestBody Recipe request) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity(recipesService.createRecipe(request), headers, HttpStatus.OK);
    }
}
