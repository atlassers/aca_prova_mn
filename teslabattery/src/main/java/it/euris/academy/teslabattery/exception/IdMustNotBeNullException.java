package it.euris.academy.teslabattery.exception;

public class IdMustNotBeNullException extends RuntimeException {
  
  private static final long serialVersionUID = 1L;
  
  public IdMustNotBeNullException() {
    super("Id must not be null.");  
   
  }
  
  public IdMustNotBeNullException(String message) {
    super(message);
  }

}
