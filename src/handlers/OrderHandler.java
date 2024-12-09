package handlers;

import model.Request;

public class OrderHandler implements Handler{
  public Handler next;

  public OrderHandler(Handler handler) {
    this.next = handler;
  }
  @Override
  public void setNext(Handler handler) {
    this.next = handler;
  }

  @Override
  public void handle(Request request) {
    System.out.println("Inside Order Handler");
    if(next != null ) next.handle(request);
    else
      System.out.println("Processing completed");
  }
}
