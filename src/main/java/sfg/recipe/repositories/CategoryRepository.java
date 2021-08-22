package sfg.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import sfg.recipe.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
