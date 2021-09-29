package it.euris.academy.six.data.dto;

import java.util.List;
import java.util.stream.Collectors;
import com.fasterxml.jackson.annotation.JsonIgnore;
import it.euris.academy.six.UT.UT;
import it.euris.academy.six.data.archetype.Dto;
import it.euris.academy.six.data.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EmployeeDto implements Dto {
  private String id;
  private String name;
  private String role;

  @JsonIgnore
  private List<ProductiveCycleDto> productiveCycles;

  @Override
  public Employee toModel() {
    Employee employee = Employee.builder().id(id == null ? null : UT.toLong(id)).name(name)
        .role(UT.getEmployeeRole(role)).build();
    if (this.getProductiveCycles() != null) {
      employee.getProductiveCycles().addAll(this.getProductiveCycles().stream()
          .map(ProductiveCycleDto::toModel).collect(Collectors.toList()));
    }
    return employee;
  }

}
