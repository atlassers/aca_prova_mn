package it.euris.academy.teslabattery.data.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import it.euris.academy.teslabattery.UT.UT;
import it.euris.academy.teslabattery.data.archetype.Dto;
import it.euris.academy.teslabattery.data.model.Robot;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RobotDto implements Dto {

  private String id;
  private String order;
  private String task;

  @JsonIgnore
  private AssemblyLineDto assemblyLine;

  @Override
  public Robot toModel() {
    return Robot.builder().id(id == null ? null : UT.toLong(id)).order(UT.toInteger(id))
        .task(UT.getRobotTask(task)).build();
  }

}
