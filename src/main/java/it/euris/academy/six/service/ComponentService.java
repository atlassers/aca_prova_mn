package it.euris.academy.six.service;

import java.util.List;
import it.euris.academy.six.data.dto.ComponentDto;

public interface ComponentService {
  public ComponentDto getById(Long id);

  public List<ComponentDto> getAll();

  public ComponentDto add(ComponentDto dto);

  public ComponentDto update(ComponentDto dto);

  public Boolean delete(Long id);
}
