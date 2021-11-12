package com.groc.recipes;

import com.groc.recipes.model.Recipe;
import com.groc.recipes.service.RecipesService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RecipesApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(RecipesApplicationTests.class);

	@Autowired
	private RecipesService recipesService;

	@Test
	void contextLoads() {
	}

	@Test
	void getAllRecipesTest() {
		Iterable<Recipe> recipes = recipesService.getAllRecipes();
		for(Recipe recipe: recipes) {
			logger.info("Found: " + recipe.getId() + " - " + recipe.getName());
			assert(recipe.getId() != null);
		}
	}

}
