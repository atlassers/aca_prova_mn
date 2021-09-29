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
import it.euris.academy.six.data.dto.ComponentDto;
import it.euris.academy.six.service.ComponentService;
@RestController
@RequestMapping("/components")
public class ComponentController {
  @Autowired
  ComponentService componentService;

  @GetMapping("/v0")
  public List<ComponentDto> getAll() {
      return componentService.getAll();
  }

  @GetMapping("/v0/{id}")
  public ComponentDto getById(@PathVariable("id") Long id) {
      return componentService.getById(id);
  }

  @DeleteMapping("/v0/{id}")
  public Boolean delete(@PathVariable("id") Long id) {
      return componentService.delete(id);
  }

  @PostMapping("/v0")
  public ComponentDto insert(@RequestBody ComponentDto dto) {
      return componentService.add(dto);
  }

  @PutMapping("/v0")
  public ComponentDto update(@RequestBody ComponentDto dto) {
      return componentService.update(dto);
  }

}
