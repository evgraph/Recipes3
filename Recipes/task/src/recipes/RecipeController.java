package recipes;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api")
@RestController
public class RecipeController {

    private List<Recipe> recipes = new ArrayList<>();

    @GetMapping("/recipe")
    public Recipe getLastRecipe() {
        return recipes.get(recipes.size() - 1);
    }

    @PostMapping("/recipe")
    public void addRecipe(@RequestBody Recipe recipe) {
        recipes.add(recipe);
    }
}