package it.euris.academy.six.UT;

import java.time.Instant;
import it.euris.academy.six.data.enums.EmployeeRole;
import it.euris.academy.six.data.enums.ProductionStatus;
import it.euris.academy.six.data.enums.RobotTask;
import it.euris.academy.six.data.enums.UnitMeasure;

public class UT {

  
  
  public static UnitMeasure getUnitMeasure(String value) {
    if (value == null)
      return null;
    for (UnitMeasure unitMeasure : UnitMeasure.values()) {
      if (unitMeasure.name().equals(value))
        return unitMeasure;
    }
    return null;
  }

  public static EmployeeRole getEmployeeRole(String value) {
    if (value == null)
      return null;
    for (EmployeeRole employeeRole : EmployeeRole.values()) {
      if (employeeRole.name().equals(value))
        return employeeRole;
    }
    return null;
  }


  public static ProductionStatus getProductionStatus(String value) {
    if (value == null)
      return null;
    for (ProductionStatus productionStatus : ProductionStatus.values()) {
      if (productionStatus.name().equals(value))
        return productionStatus;
    }
    return null;
  }


  public static Long toLong(String value) {
    return value == null ? null : Long.parseLong(value);
  }

  public static Integer toInteger(String value) {
    return value == null ? null : Integer.parseInt(value);
  }

  public static Double toDouble(String value) {
    return value == null ? null : Double.parseDouble(value);
  }

  public static Instant toInstant(String value) {
    return value == null ? null : Instant.parse(value);
  }

  public static Boolean toBoolean(String value) {
    return value == null ? null : Boolean.parseBoolean(value);
  }

  public static String fromInstant(Instant value) {
    return value == null ? null : value.toString();
  }

  public static String getEmployeeRole(EmployeeRole value) {
    return value == null ? null : value.name();
  }

  public static String getProductionStatus(ProductionStatus value) {
    return value == null ? null : value.name();
  }


  public static String getRobotTask(RobotTask value) {
    return value == null ? null : value.name();
  }

  public static RobotTask getRobotTask(String value) {
    if (value == null)
      return null;
    for (RobotTask category : RobotTask.values()) {
      if (category.name().equals(value))
        return category;
    }
    return null;
  }

  public static String getUnitMeasure(UnitMeasure value) {
    return value == null ? null : value.name();
  }


}
