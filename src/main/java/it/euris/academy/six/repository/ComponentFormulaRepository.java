package it.euris.academy.six.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import it.euris.academy.six.data.model.ComponentFormula;
import it.euris.academy.six.data.model.key.ComponentFormulaKey;

public interface ComponentFormulaRepository extends JpaRepository<ComponentFormula, ComponentFormulaKey> {

  @Query(value = "select cf.* from component_formula cf where cf.component_id=:componentId and cf.formula_id=:formulaId",nativeQuery = true)
  ComponentFormula findByComponentAndFormula(@Param("componentId")Long movieId,@Param("formulaId")Long actorId);
}
