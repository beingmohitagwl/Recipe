package sfg.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sfg.recipe.domain.Category;
import sfg.recipe.domain.UnitOfMeasure;
import sfg.recipe.repositories.CategoryRepository;
import sfg.recipe.repositories.UnitOfMeasureRepository;
import sfg.recipe.services.RecipeService;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
