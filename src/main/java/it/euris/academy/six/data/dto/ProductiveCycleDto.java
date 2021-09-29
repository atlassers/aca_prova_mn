package it.euris.academy.six.data.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import it.euris.academy.six.UT.UT;
import it.euris.academy.six.data.archetype.Dto;
import it.euris.academy.six.data.model.AssemblyLine;
import it.euris.academy.six.data.model.ProductiveCycle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductiveCycleDto implements Dto {

  private String id;
  private String assemblyLineId;
  private String startDate;
  private String endDate;
  private String statusDate;
  private String status;
  private Boolean isDeleted;

  @JsonIgnore
  private String supervisor;

  @Override
  public ProductiveCycle toModel() {
    return ProductiveCycle.builder().id(UT.toLong(id))
        .assemblyLineId(new AssemblyLine(assemblyLineId)).startDate(UT.toInstant(startDate))
        .endDate(UT.toInstant(endDate)).statusDate(UT.toInstant(endDate))
        .status(UT.getProductionStatus(status)).isDeleted(isDeleted).build();
  }

}
