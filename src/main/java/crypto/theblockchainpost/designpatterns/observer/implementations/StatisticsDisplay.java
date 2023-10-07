package crypto.theblockchainpost.designpatterns.observer.implementations;

import crypto.theblockchainpost.designpatterns.observer.interfaces.DisplayData;
import crypto.theblockchainpost.designpatterns.observer.interfaces.Observer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StatisticsDisplay implements Observer, DisplayData {

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        log.info("Avg, Max, Min: 80, 80, 80.");
    }

    @Override
    public void update() {
        display();
    }
}
