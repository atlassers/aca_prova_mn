package it.euris.academy.six.controller;

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
import it.euris.academy.six.data.dto.AssemblyLineDto;
import it.euris.academy.six.service.AssemblyLineService;

@RestController
@RequestMapping("/assembly-lines")
public class AssemblyLineController {
  
  @Autowired
  AssemblyLineService assemblyLineService;

  @GetMapping("/v0")
  public List<AssemblyLineDto> getAll() {
      return assemblyLineService.getAll();
  }

  @GetMapping("/v0/{id}")
  public AssemblyLineDto getById(@PathVariable("id") Long id) {
      return assemblyLineService.getById(id);
  }

  @DeleteMapping("/v0/{id}")
  public Boolean delete(@PathVariable("id") Long id) {
      return assemblyLineService.delete(id);
  }

  @PostMapping("/v0")
  public AssemblyLineDto insert(@RequestBody AssemblyLineDto dto) {
      return assemblyLineService.add(dto);
  }

  @PutMapping("/v0")
  public AssemblyLineDto update(@RequestBody AssemblyLineDto dto) {
      return assemblyLineService.update(dto);
  }

}
