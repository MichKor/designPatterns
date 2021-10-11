package observer;

import observer.notification.EmailMessage;
import observer.notification.MobileApp;
import observer.notification.TextMessage;
import observer.order.Order;
import observer.order.OrderStatus;

public class mainObserver {

    public static void main(String[] args) {
        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        EmailMessage emailMessage = new EmailMessage();
        MobileApp mobileApp = new MobileApp();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(emailMessage);

        order.notifyObservers();
        System.out.println("----------------");
        order.changeOrderStatus(OrderStatus.WYSLANE);

        order.unregisterObserver(emailMessage);
        System.out.println("----------------");
        order.changeOrderStatus(OrderStatus.ODEBRANE);
    }
}
