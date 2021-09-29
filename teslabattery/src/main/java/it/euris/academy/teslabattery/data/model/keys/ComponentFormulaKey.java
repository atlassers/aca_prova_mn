package it.euris.academy.teslabattery.data.model.keys;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComponentFormulaKey implements Serializable{
  private static final long serialVersionUID = 1L;

  @Column(name = "component_id")
  Long componentId;

  @Column(name = "formula_id")
  Long formulaId;
}
