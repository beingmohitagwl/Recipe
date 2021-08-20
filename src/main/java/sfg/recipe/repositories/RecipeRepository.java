package sfg.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import sfg.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
