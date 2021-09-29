package it.euris.academy.teslabattery.data.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import it.euris.academy.teslabattery.data.archetype.Model;
import it.euris.academy.teslabattery.data.dto.AssemblyLineDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "assembly_line")
@Entity
public class AssemblyLine implements Model {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Double maxLength; // max period

  @OneToMany(mappedBy = "assemblyLine")
  private List<Robot> robots;


  public AssemblyLine(String assemblyLineId) {
    if (assemblyLineId != null) {
      this.id = Long.parseLong(assemblyLineId);
    }
  }

  @Override
  public AssemblyLineDto toDto() {
    return AssemblyLineDto.builder().id(id == null ? null : id.toString()).name(name)
        .maxLength(maxLength.toString()).build();
  }
}
