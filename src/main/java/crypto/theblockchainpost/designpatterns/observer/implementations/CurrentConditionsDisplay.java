package crypto.theblockchainpost.designpatterns.observer.implementations;

import crypto.theblockchainpost.designpatterns.observer.interfaces.DisplayData;
import crypto.theblockchainpost.designpatterns.observer.interfaces.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayData {

    private final WeatherData weatherData;

    private double humidity;
    private double temperature;
    private double pressure;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Weather conditions: ");
        System.out.printf("humidity: %s, ", humidity);
        System.out.printf("pressure: %s, ", pressure);
        System.out.printf("temperature: %s", temperature);
        System.out.println(".");
    }

    @Override
    public void update() {
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        this.temperature = weatherData.getTemperature();
        display();
    }
}
