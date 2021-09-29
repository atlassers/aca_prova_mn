package it.euris.academy.teslabattery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.academy.teslabattery.data.model.AssemblyLine;


public interface AssemblyLineRepository extends JpaRepository<AssemblyLine, Long> {

}
