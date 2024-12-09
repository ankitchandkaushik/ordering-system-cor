package handlers;

import model.Request;

public class RequestValidationHandler implements Handler{

  Handler next;

  public RequestValidationHandler(Handler handler) {
    this.next = handler;
  }
  @Override
  public void setNext(Handler handler) {
    this.next = handler;
  }

  @Override
  public void handle(Request request) {
    // TODO add logic
    System.out.println("Inside RequestValidationHandler Handler");
    if(next != null ) next.handle(request);
    else
      System.out.println("Processing completed");
  }
}
