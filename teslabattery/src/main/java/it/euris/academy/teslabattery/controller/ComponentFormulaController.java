package it.euris.academy.teslabattery.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.euris.academy.teslabattery.data.dto.ComponentFormulaDto;
import it.euris.academy.teslabattery.service.ComponentFormulaService;
@RestController
@RequestMapping("/components-formulas")
public class ComponentFormulaController {
  @Autowired
  ComponentFormulaService componentFormulaService;

  @GetMapping("/v6")
  public List<ComponentFormulaDto> getAll() {
      return componentFormulaService.getAll();
  }

  @GetMapping("/v6/{componentId}/{formulaId}")
  public ComponentFormulaDto getById(@PathVariable("componentId") Long componentId,@PathVariable("formulaId") Long formulaId) {
      return componentFormulaService.getByComponentAndFormula(componentId,formulaId);
  }

  @DeleteMapping("/v6/{componentId}/{formulaId}")
  public Boolean delete(@PathVariable("componentId") Long componentId,@PathVariable("formulaId") Long formulaId) {
      return componentFormulaService.delete(componentId,formulaId);
  }

  @PostMapping("/v6")
  public ComponentFormulaDto insert(@RequestBody ComponentFormulaDto dto) {
      return componentFormulaService.add(dto);
  }

  @PutMapping("/v6")
  public ComponentFormulaDto update(@RequestBody ComponentFormulaDto dto) {
      return componentFormulaService.update(dto);
  }

}
