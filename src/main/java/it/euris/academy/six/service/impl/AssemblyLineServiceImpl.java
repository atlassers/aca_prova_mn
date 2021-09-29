package it.euris.academy.six.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.euris.academy.six.data.dto.AssemblyLineDto;
import it.euris.academy.six.data.model.AssemblyLine;
import it.euris.academy.six.exception.IdMustBeNullException;
import it.euris.academy.six.exception.IdMustNotBeNullException;
import it.euris.academy.six.repository.AssemblyLineRepository;
import it.euris.academy.six.service.AssemblyLineService;

@Service
public class AssemblyLineServiceImpl implements AssemblyLineService {

  @Autowired
  private AssemblyLineRepository assemblyLineRepository;
  
  @Override
  public AssemblyLineDto getById(Long id) {
    return assemblyLineRepository.findById(id).orElse(new AssemblyLine()).toDto();
  }

  @Override
  public List<AssemblyLineDto> getAll() {
    return assemblyLineRepository.findAll()
        .stream().map(curAssemblyLine -> curAssemblyLine.toDto())
        .collect(Collectors.toList());
  }

  @Override
  public AssemblyLineDto add(AssemblyLineDto assemblyLineDto) {
    if (assemblyLineDto.getIdAssemblyLine() != null) {
      throw new IdMustBeNullException();
    }
    return assemblyLineRepository.save(assemblyLineDto.toModel()).toDto();
  }

  @Override
  public AssemblyLineDto update(AssemblyLineDto assemblyLineDto) {
    if (assemblyLineDto.getIdAssemblyLine() != null) {
      throw new IdMustNotBeNullException();
    }
    return assemblyLineRepository.save(assemblyLineDto.toModel()).toDto();
  }

  @Override
  public Boolean delete(Long id) {
    assemblyLineRepository.deleteById(id);
    return assemblyLineRepository.findById(id).isEmpty();
  }

}
