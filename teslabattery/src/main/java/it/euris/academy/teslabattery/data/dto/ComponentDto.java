package it.euris.academy.teslabattery.data.dto;

import java.util.List;
import java.util.stream.Collectors;
import com.fasterxml.jackson.annotation.JsonIgnore;
import it.euris.academy.teslabattery.UT.UT;
import it.euris.academy.teslabattery.data.archetype.Dto;
import it.euris.academy.teslabattery.data.model.Component;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ComponentDto implements Dto  {

  private String id;
  private String name;
  private String isDangerous;
  
  @JsonIgnore
  private List<ComponentFormulaDto> componentFormulas;
  
  @Override
  public Component toModel() {
    Component component = Component.builder().id(id == null ? null : UT.toLong(id)).name(name)
     .isDangerous(UT.toBoolean(isDangerous)).build();
    if (this.getComponentFormulas() != null) {
      component.getComponentFormulas()
          .addAll(this.getComponentFormulas().stream().map(ComponentFormulaDto::toModel).collect(Collectors.toList()));
    }
    return component;
  }

}
