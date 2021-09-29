package it.euris.academy.teslabattery.exception;

public class IdMustBeNullException extends RuntimeException {
  
  private static final long serialVersionUID = 1L;
  
  public IdMustBeNullException() {
    super("Id must be null. You sent a dto with an id already");
   }
  
  public IdMustBeNullException(String message) {
    super(message);
  }

}
