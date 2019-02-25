package edu.umss.dip.ssiservice.repositories;

import edu.umss.dip.ssiservice.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
