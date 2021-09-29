package it.euris.academy.six.data.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import it.euris.academy.six.UT.UT;
import it.euris.academy.six.data.archetype.Model;
import it.euris.academy.six.data.dto.ComponentFormulaDto;
import it.euris.academy.six.data.enums.UnitMeasure;
import it.euris.academy.six.data.model.key.ComponentFormulaKey;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "component_formula")
@Entity
public class ComponentFormula implements Model {

  @EmbeddedId
  private ComponentFormulaKey idKey;

  @ManyToOne
  @MapsId("componentId")
  @JoinColumn(name = "component_id")
  private Component component;

  @ManyToOne
  @MapsId("formulaId")
  @JoinColumn(name = "formula_id")
  private Formula formula;

  private Double quantity;
  private UnitMeasure unitMeasure;

  @Override
  public ComponentFormulaDto toDto() {
    return ComponentFormulaDto.builder().idKey(idKey).component(component.getId().toString())
        .formula(formula.getId().toString()).quantity(quantity.toString())
        .unitMeasure(UT.getUnitMeasure(unitMeasure)).build();
  }

}
