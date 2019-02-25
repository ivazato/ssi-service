package edu.umss.dip.ssiservice.repositories;

import edu.umss.dip.ssiservice.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
