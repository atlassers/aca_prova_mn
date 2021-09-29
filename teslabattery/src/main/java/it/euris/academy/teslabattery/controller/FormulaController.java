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
import it.euris.academy.teslabattery.data.dto.FormulaDto;
import it.euris.academy.teslabattery.service.FormulaService;
@RestController
@RequestMapping("/formulas")
public class FormulaController {
  @Autowired
  FormulaService formulaService;

  @GetMapping("/v6")
  public List<FormulaDto> getAll() {
      return formulaService.getAll();
  }

  @GetMapping("/v6/{id}")
  public FormulaDto getById(@PathVariable("id") Long id) {
      return formulaService.getById(id);
  }

  @DeleteMapping("/v6/{id}")
  public Boolean delete(@PathVariable("id") Long id) {
      return formulaService.delete(id);
  }

  @PostMapping("/v6")
  public FormulaDto insert(@RequestBody FormulaDto dto) {
      return formulaService.add(dto);
  }

  @PutMapping("/v6")
  public FormulaDto update(@RequestBody FormulaDto dto) {
      return formulaService.update(dto);
  }

}
