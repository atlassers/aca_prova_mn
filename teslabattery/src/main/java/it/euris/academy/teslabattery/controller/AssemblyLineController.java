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
import it.euris.academy.teslabattery.data.dto.AssemblyLineDto;
import it.euris.academy.teslabattery.service.AssemblyLineService;

@RestController
@RequestMapping("/assembly-lines")
public class AssemblyLineController {
  @Autowired
  AssemblyLineService assemblyLineService;

  @GetMapping("/v6")
  public List<AssemblyLineDto> getAll() {
      return assemblyLineService.getAll();
  }

  @GetMapping("/v6/{id}")
  public AssemblyLineDto getById(@PathVariable("id") Long id) {
      return assemblyLineService.getById(id);
  }

  @DeleteMapping("/v6/{id}")
  public Boolean delete(@PathVariable("id") Long id) {
      return assemblyLineService.delete(id);
  }

  @PostMapping("/v6")
  public AssemblyLineDto insert(@RequestBody AssemblyLineDto dto) {
      return assemblyLineService.add(dto);
  }

  @PutMapping("/v6")
  public AssemblyLineDto update(@RequestBody AssemblyLineDto dto) {
      return assemblyLineService.update(dto);
  }

}
