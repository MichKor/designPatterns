package observer.zadanie.notification;

import observer.zadanie.weather_forecast.WeatherForecast;

public class RadioNews implements Observer {

    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature()
                + " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }
}
