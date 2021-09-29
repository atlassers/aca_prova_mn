package it.euris.academy.six.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.academy.six.data.model.Robot;

public interface RobotRepository extends JpaRepository<Robot, Long> {

}
