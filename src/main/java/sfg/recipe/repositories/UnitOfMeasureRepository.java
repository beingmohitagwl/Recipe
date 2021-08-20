package sfg.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import sfg.recipe.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
