package it.euris.academy.six.service;

import java.util.List;
import it.euris.academy.six.data.dto.AssemblyLineDto;

public interface AssemblyLineService {
  public AssemblyLineDto getById(Long id);

  public List<AssemblyLineDto> getAll();

  public AssemblyLineDto add(AssemblyLineDto dto);

  public AssemblyLineDto update(AssemblyLineDto dto);

  public Boolean delete(Long id);
}
