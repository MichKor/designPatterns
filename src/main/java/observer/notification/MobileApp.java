package observer.notification;

import observer.order.Order;

public class MobileApp implements Observer {

    public void update(Order order) {
        System.out.println("Aplikacja mobilna - zamówienie numer: " + order.getOrderNumber()
                + " zmieniło status na: " + order.getOrderStatus());
    }
}
