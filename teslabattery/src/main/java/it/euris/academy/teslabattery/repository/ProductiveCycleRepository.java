package it.euris.academy.teslabattery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.academy.teslabattery.data.model.ProductiveCycle;

public interface ProductiveCycleRepository extends JpaRepository<ProductiveCycle, Long> {

}
