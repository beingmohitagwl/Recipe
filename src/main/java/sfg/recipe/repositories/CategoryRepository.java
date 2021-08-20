package sfg.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import sfg.recipe.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
