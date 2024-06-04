package com.example.RecipeBookBackend.Initializer;

import com.example.RecipeBookBackend.Model.Recipe;
import com.example.RecipeBookBackend.Repository.RecipeBookRepository;
import jakarta.annotation.PostConstruct;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;

import java.io.FileReader;
import java.util.List;

@Component
public class RecipeBookInitializer {
    private final RecipeBookRepository recipeBookRepository;

    @Value("classpath:recipes.json")
    private Resource mockDataFile;

    @Autowired
    public RecipeBookInitializer(RecipeBookRepository recipeBookRepository) {
        this.recipeBookRepository = recipeBookRepository;
    }

    @PostConstruct
    public void init() {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(mockDataFile.getFile())) {
            Object obj = jsonParser.parse(reader);

            JSONArray jsonArray = (JSONArray) obj;

            for (Object recipe: jsonArray) {
                JSONObject recipeJSON = (JSONObject) recipe;

                long id = (long) recipeJSON.get("id");
                String img = (String) recipeJSON.get("img");
                String name = (String) recipeJSON.get("name");
                String madeBy = (String) recipeJSON.get("madeBy");
                String desc = (String) recipeJSON.get("desc");
                List<String> ingredients = (List<String>) recipeJSON.get("ingredients");
                List<String> steps = (List<String>) recipeJSON.get("steps");
                String category = (String) recipeJSON.get("category");
                List<String> suitableFor = (List<String>) recipeJSON.get("suitableFor");

                recipeBookRepository.addRecipe(new Recipe(id, img, name, madeBy, desc, ingredients, steps, category, suitableFor));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
