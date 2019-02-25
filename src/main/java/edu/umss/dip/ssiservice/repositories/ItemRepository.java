package edu.umss.dip.ssiservice.repositories;

import edu.umss.dip.ssiservice.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
