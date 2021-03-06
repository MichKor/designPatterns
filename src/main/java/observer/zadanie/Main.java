package observer.zadanie;

import observer.zadanie.notification.InternetNews;
import observer.zadanie.notification.RadioNews;
import observer.zadanie.notification.TvNews;
import observer.zadanie.weather_forecast.WeatherForecast;

public class Main {

    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);

        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();

        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);

        weatherForecast.notifyObservers();

        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);

        System.out.println("\nNowa prognoza - powiadomienie tylko dla serwisu internetowego:");

        weatherForecast.updateForecast(18, 1007);
    }
}
