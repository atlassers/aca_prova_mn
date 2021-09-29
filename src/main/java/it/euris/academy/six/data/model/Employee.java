package it.euris.academy.six.data.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import it.euris.academy.six.UT.UT;
import it.euris.academy.six.data.archetype.Model;
import it.euris.academy.six.data.dto.EmployeeDto;
import it.euris.academy.six.data.enums.EmployeeRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "employee")
@Entity
public class Employee implements Model {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private EmployeeRole role;

  @OneToMany(mappedBy = "supervisor")
  private List<ProductiveCycle> productiveCycles;


  public Employee(String employeeId) {
    if (employeeId != null) {
      this.id = Long.parseLong(employeeId);
    }
  }

  @Override
  public EmployeeDto toDto() {
    return EmployeeDto.builder().id(id == null ? null : id.toString()).name(name)
        .role(UT.getEmployeeRole(role)).build();
  }



}
