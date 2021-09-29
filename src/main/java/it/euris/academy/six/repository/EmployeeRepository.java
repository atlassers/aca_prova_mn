package it.euris.academy.six.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.academy.six.data.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
