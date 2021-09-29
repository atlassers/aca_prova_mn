package it.euris.academy.teslabattery.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.euris.academy.teslabattery.data.dto.EmployeeDto;
import it.euris.academy.teslabattery.data.model.Employee;
import it.euris.academy.teslabattery.exception.IdMustBeNullException;
import it.euris.academy.teslabattery.exception.IdMustNotBeNullException;
import it.euris.academy.teslabattery.repository.EmployeeRepository;
import it.euris.academy.teslabattery.service.EmployeeService;


@Service
public class EmployeeServiceimpl implements EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;
  
  @Override
  public EmployeeDto getById(Long id) {
    return employeeRepository.findById(id).orElse(new Employee()).toDto();
  }

  @Override
  public List<EmployeeDto> getAll() {
    return employeeRepository.findAll()
        .stream().map(curProduct -> curProduct.toDto())
        .collect(Collectors.toList());
  }

  @Override
  public EmployeeDto add(EmployeeDto employeeDto) {
    if (employeeDto.getId() != null) {
      throw new IdMustBeNullException();
    }
    return employeeRepository.save(employeeDto.toModel()).toDto();
  }

  @Override
  public EmployeeDto update(EmployeeDto employeeDto) {
    if (employeeDto.getId() != null) {
      throw new IdMustNotBeNullException();
    }
    return employeeRepository.save(employeeDto.toModel()).toDto();
  }

  @Override
  public Boolean delete(Long id) {
    employeeRepository.deleteById(id);
    return employeeRepository.findById(id).isEmpty();
  }

}
