package crypto.theblockchainpost.designpatterns.observer.implementations;

import crypto.theblockchainpost.designpatterns.observer.interfaces.DisplayData;
import crypto.theblockchainpost.designpatterns.observer.interfaces.Observer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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
        log.info("Weather conditions: ");
        log.info("humidity: {}, ", humidity);
        log.info("pressure: {}, ", pressure);
        log.info("temperature: {}", temperature);
    }

    @Override
    public void update() {
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        this.temperature = weatherData.getTemperature();
        display();
    }
}
