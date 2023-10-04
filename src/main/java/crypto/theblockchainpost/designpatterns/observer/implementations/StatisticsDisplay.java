package crypto.theblockchainpost.designpatterns.observer.implementations;

import crypto.theblockchainpost.designpatterns.observer.interfaces.DisplayData;
import crypto.theblockchainpost.designpatterns.observer.interfaces.Observer;

public class StatisticsDisplay implements Observer, DisplayData {

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg, Max, Min: 80, 80, 80.");
    }

    @Override
    public void update() {
        display();
    }
}
