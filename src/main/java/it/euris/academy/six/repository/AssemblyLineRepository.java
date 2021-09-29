package it.euris.academy.six.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.academy.six.data.model.AssemblyLine;


public interface AssemblyLineRepository extends JpaRepository<AssemblyLine, Long> {

}
