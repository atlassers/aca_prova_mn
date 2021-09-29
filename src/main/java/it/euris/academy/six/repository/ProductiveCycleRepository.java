package it.euris.academy.six.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.academy.six.data.model.ProductiveCycle;

public interface ProductiveCycleRepository extends JpaRepository<ProductiveCycle, Long> {

}
