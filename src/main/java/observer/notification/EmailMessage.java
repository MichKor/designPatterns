package observer.notification;

import observer.order.Order;

public class EmailMessage implements Observer {

    public void update(Order order) {
        System.out.println("E-mail - zamówienie numer: " + order.getOrderNumber()
                + " zmieniło status na: " + order.getOrderStatus());
    }
}
