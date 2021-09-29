package it.euris.academy.six.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.euris.academy.six.data.dto.ComponentFormulaDto;
import it.euris.academy.six.data.model.ComponentFormula;
import it.euris.academy.six.repository.ComponentFormulaRepository;
import it.euris.academy.six.service.ComponentFormulaService;

@Service
public class ComponentFormulaServiceImpl implements ComponentFormulaService {

  @Autowired
  private ComponentFormulaRepository ComponentFormulaRepository;

  @Override
  public ComponentFormulaDto getByComponentAndFormula(Long componentId, Long formulaId) {
    return ComponentFormulaRepository.findByComponentAndFormula(componentId, componentId).toDto();
  }

  @Override
  public List<ComponentFormulaDto> getAll() {
    return ComponentFormulaRepository.findAll().stream().map(componentFormula -> componentFormula.toDto())
        .collect(Collectors.toList());
  }

  @Override
  public ComponentFormulaDto add(ComponentFormulaDto dto) {
    return ComponentFormulaRepository.save(dto.toModel()).toDto();
  }

  @Override
  public ComponentFormulaDto update(ComponentFormulaDto dto) {
    return ComponentFormulaRepository.save(dto.toModel()).toDto();
  }

  @Override
  public Boolean delete(Long componentId, Long formulaId) {
    ComponentFormula toDelete = ComponentFormulaRepository.findByComponentAndFormula(componentId, formulaId);
    ComponentFormulaRepository.delete(toDelete);
    return ComponentFormulaRepository.findById(toDelete.getId()).isEmpty();
  }
}
