package crypto.theblockchainpost.designpatterns.observer.implementations;

import crypto.theblockchainpost.designpatterns.observer.interfaces.DisplayData;
import crypto.theblockchainpost.designpatterns.observer.interfaces.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayData {

    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Weather conditions: %s%n", weatherData.getWeatherDataValues());
    }

    @Override
    public void update() {
        display();
    }
}
