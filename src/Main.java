import handlers.*;
import model.Request;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Handler order = new OrderHandler(null);
    Handler payment = new PaymentHandler(order);
    Handler validator = new RequestValidationHandler(payment);
    Handler authorisor = new AuthorisationHandler(validator);
    Handler authenticator = new AuthenticationHandler(authorisor);

    Request request = new Request();

    authenticator.handle(request);

  }
}
