package it.euris.academy.teslabattery.service;

import java.util.List;
import it.euris.academy.teslabattery.data.dto.RobotDto;

public interface RobotService {
  public RobotDto getById(Long id);

  public List<RobotDto> getAll();

  public RobotDto add(RobotDto dto);

  public RobotDto update(RobotDto dto);

  public Boolean delete(Long id);
}
