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
import it.euris.academy.teslabattery.data.dto.ComponentDto;
import it.euris.academy.teslabattery.service.ComponentService;
@RestController
@RequestMapping("/components")
public class ComponentController {
  @Autowired
  ComponentService componentService;

  @GetMapping("/v6")
  public List<ComponentDto> getAll() {
      return componentService.getAll();
  }

  @GetMapping("/v6/{id}")
  public ComponentDto getById(@PathVariable("id") Long id) {
      return componentService.getById(id);
  }

  @DeleteMapping("/v6/{id}")
  public Boolean delete(@PathVariable("id") Long id) {
      return componentService.delete(id);
  }

  @PostMapping("/v6")
  public ComponentDto insert(@RequestBody ComponentDto dto) {
      return componentService.add(dto);
  }

  @PutMapping("/v6")
  public ComponentDto update(@RequestBody ComponentDto dto) {
      return componentService.update(dto);
  }

}
