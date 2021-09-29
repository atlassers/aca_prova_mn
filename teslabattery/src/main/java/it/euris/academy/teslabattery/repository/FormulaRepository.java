package it.euris.academy.teslabattery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.academy.teslabattery.data.model.Formula;

public interface FormulaRepository extends JpaRepository<Formula, Long> {

}
