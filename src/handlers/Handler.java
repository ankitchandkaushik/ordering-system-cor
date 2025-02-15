package handlers;

import model.Request;

public interface Handler {
  public void setNext(Handler handler);
  public void handle(Request request);
}
