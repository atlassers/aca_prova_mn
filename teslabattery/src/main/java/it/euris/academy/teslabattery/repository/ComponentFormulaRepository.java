package it.euris.academy.teslabattery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import it.euris.academy.teslabattery.data.model.ComponentFormula;
import it.euris.academy.teslabattery.data.model.keys.ComponentFormulaKey;

public interface ComponentFormulaRepository extends JpaRepository<ComponentFormula, ComponentFormulaKey> {

  @Query(value = "select c.* from component_formula c where c.component_id=:componentId and c.formula_id=:formulaId",nativeQuery = true)
  ComponentFormula findByComponentAndFormula(@Param("componentId")Long movieId,@Param("formulaId")Long actorId);
}
