package handlers;

import model.Request;

public class PaymentHandler implements Handler{

  Handler next;

  public PaymentHandler(Handler handler) {
    this.next = handler;
  }
  @Override
  public void setNext(Handler handler) {
    this.next = handler;
  }

  @Override
  public void handle(Request request) {
    System.out.println("Inside payment handler");
    // TODO add logic
    if(next != null ) next.handle(request);
    else
      System.out.println("Processing completed");

  }
}
