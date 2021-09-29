package it.euris.academy.teslabattery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.academy.teslabattery.data.model.Component;


public interface ComponentRepository extends JpaRepository<Component, Long> {

}
