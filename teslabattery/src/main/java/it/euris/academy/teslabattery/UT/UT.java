package it.euris.academy.teslabattery.UT;

import java.time.Instant;
import it.euris.academy.teslabattery.data.enums.EmployeeRole;
import it.euris.academy.teslabattery.data.enums.ProductionStatus;
import it.euris.academy.teslabattery.data.enums.RobotTasks;
import it.euris.academy.teslabattery.data.enums.UnitMeasure;

public class UT {

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
  
  public static EmployeeRole getEmployeeRole(String value) {
    if (value == null)
      return null;
    for (EmployeeRole employeeRole : EmployeeRole.values()) {
      if (employeeRole.name().equals(value))
        return employeeRole;
    }
    return null;
  }
  
  public static String getProductionStatus(ProductionStatus value) {
    return value == null ? null : value.name();
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
  
  public static String getRobotTask(RobotTasks value) {
    return value == null ? null : value.name();
  }
  
  public static RobotTasks getRobotTask(String value) {
    if (value == null)
      return null;
    for (RobotTasks category : RobotTasks.values()) {
      if (category.name().equals(value))
        return category;
    }
    return null;
  }
  
  public static String getUnitMeasure(UnitMeasure value) {
    return value == null ? null : value.name();
  }
  
  public static UnitMeasure getUnitMeasure(String value) {
    if (value == null)
      return null;
    for (UnitMeasure unitMeasure : UnitMeasure.values()) {
      if (unitMeasure.name().equals(value))
        return unitMeasure;
    }
    return null;
  }
  
}
