package it.euris.academy.six.data.dto;

import java.util.List;
import java.util.stream.Collectors;
import com.fasterxml.jackson.annotation.JsonIgnore;
import it.euris.academy.six.UT.UT;
import it.euris.academy.six.data.archetype.Dto;
import it.euris.academy.six.data.model.AssemblyLine;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AssemblyLineDto implements Dto {
  private String id;
  private String name;
  private String maxLength;
  @JsonIgnore
  private List<RobotDto> robots;

  @Override
  public AssemblyLine toModel() {

    AssemblyLine al = AssemblyLine.builder().id(id == null ? null : UT.toLong(id)).name(name)
        .maxLength(UT.toDouble(maxLength)).build();
    if (this.getRobots() != null) {
      al.getRobots()
          .addAll(this.getRobots().stream().map(RobotDto::toModel).collect(Collectors.toList()));
    }
    return al;
  }

}
