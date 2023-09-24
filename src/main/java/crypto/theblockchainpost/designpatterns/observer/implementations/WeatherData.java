package crypto.theblockchainpost.designpatterns.observer.implementations;

import crypto.theblockchainpost.designpatterns.observer.WeatherDataValues;
import crypto.theblockchainpost.designpatterns.observer.interfaces.Observer;
import crypto.theblockchainpost.designpatterns.observer.interfaces.Subject;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class WeatherData implements Subject {

    private final List<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(WeatherDataValues weatherDataValues) {
        this.humidity = weatherDataValues.humidity();
        this.pressure = weatherDataValues.pressure();
        this.temperature = weatherDataValues.temperature();
        measurementsChanged();
    }

    public WeatherDataValues getWeatherDataValues() {
        return new WeatherDataValues(
                this.temperature,
                this.humidity,
                this.pressure
        );
    }
}
