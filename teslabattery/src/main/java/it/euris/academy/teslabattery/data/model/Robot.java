package it.euris.academy.teslabattery.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import it.euris.academy.teslabattery.UT.UT;
import it.euris.academy.teslabattery.data.dto.RobotDto;
import it.euris.academy.teslabattery.data.enums.RobotTasks;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "robot")
@Entity
public class Robot implements it.euris.academy.teslabattery.data.archetype.Model {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Integer order;
  private RobotTasks task;

  @ManyToOne
  @JoinColumn(name = "assembly_line", nullable = false)
  private AssemblyLine assemblyLine;

  @Override
  public RobotDto toDto() {

    return RobotDto.builder().id(id == null ? null : id.toString()).order(order.toString())
        .task(UT.getRobotTask(task)).build();
  }
}
