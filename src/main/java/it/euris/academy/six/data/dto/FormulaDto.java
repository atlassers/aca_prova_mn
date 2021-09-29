package it.euris.academy.six.data.dto;

import java.util.List;
import java.util.stream.Collectors;
import com.fasterxml.jackson.annotation.JsonIgnore;
import it.euris.academy.six.UT.UT;
import it.euris.academy.six.data.archetype.Dto;
import it.euris.academy.six.data.model.Formula;
import it.euris.academy.six.data.model.ProductiveCycle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FormulaDto implements Dto {

  private String id;
  private String assemblyLine;
  private String productiveCycle;

  @JsonIgnore
  private List<ComponentFormulaDto> componentFormulas;

  @Override
  public Formula toModel() {
    Formula formula = Formula.builder().id(id == null ? null : UT.toLong(id))
        .productiveCycle(new ProductiveCycle(productiveCycle)).build();
    if (this.getComponentFormulas() != null) {
      formula.getComponentFormulas().addAll(this.getComponentFormulas().stream()
          .map(ComponentFormulaDto::toModel).collect(Collectors.toList()));
    }
    return formula;
  }

}
