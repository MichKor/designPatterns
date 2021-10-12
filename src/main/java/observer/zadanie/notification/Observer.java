package observer.zadanie.notification;

import observer.zadanie.weather_forecast.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);

}
