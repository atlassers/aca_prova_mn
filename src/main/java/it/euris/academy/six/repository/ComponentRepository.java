package it.euris.academy.six.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.academy.six.data.model.Component;


public interface ComponentRepository extends JpaRepository<Component, Long> {

}
