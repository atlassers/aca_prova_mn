package it.euris.academy.teslabattery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.academy.teslabattery.data.model.Robot;

public interface RobotRepository extends JpaRepository<Robot, Long> {

}
