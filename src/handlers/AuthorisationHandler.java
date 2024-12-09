package handlers;

import model.Request;

public class AuthorisationHandler implements Handler{

  Handler next;

  public AuthorisationHandler(Handler handler) {
    this.next = handler;
  }

  @Override
  public void setNext(Handler handler) {
    this.next = handler;
  }

  @Override
  public void handle(Request request) {
    // TODO add logic
    System.out.println("Inside AuthorisationHandler Handler");
    if(next != null ) next.handle(request);
    else
      System.out.println("Processing completed");
  }
}
