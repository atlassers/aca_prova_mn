package it.euris.academy.six.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.academy.six.data.model.Formula;

public interface FormulaRepository extends JpaRepository<Formula, Long> {

}
