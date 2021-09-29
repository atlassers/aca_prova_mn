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
import it.euris.academy.teslabattery.data.dto.EmployeeDto;
import it.euris.academy.teslabattery.service.EmployeeService;
@RestController
@RequestMapping("/employees")
public class EmployeeController {
  @Autowired
  EmployeeService employeeService;

  @GetMapping("/v6")
  public List<EmployeeDto> getAll() {
      return employeeService.getAll();
  }

  @GetMapping("/v6/{id}")
  public EmployeeDto getById(@PathVariable("id") Long id) {
      return employeeService.getById(id);
  }

  @DeleteMapping("/v6/{id}")
  public Boolean delete(@PathVariable("id") Long id) {
      return employeeService.delete(id);
  }

  @PostMapping("/v6")
  public EmployeeDto insert(@RequestBody EmployeeDto dto) {
      return employeeService.add(dto);
  }

  @PutMapping("/v6")
  public EmployeeDto update(@RequestBody EmployeeDto dto) {
      return employeeService.update(dto);
  }

}
