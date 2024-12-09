package handlers;

import model.Request;

public class AuthenticationHandler implements Handler{
  Handler next;

  public AuthenticationHandler(Handler handler) {
    this.next = handler;
  }
  @Override
  public void setNext(Handler handler) {
    this.next = handler;
  }

  @Override
  public void handle(Request request) {
    // TODO Add check;
    System.out.println("Inside AuthenticationHandler Handler");
    if(next != null ) next.handle(request);
    else
      System.out.println("Processing completed");
  }
}
