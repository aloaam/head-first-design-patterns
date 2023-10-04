package crypto.theblockchainpost.designpatterns.observer;

import crypto.theblockchainpost.designpatterns.observer.implementations.CurrentConditionsDisplay;
import crypto.theblockchainpost.designpatterns.observer.implementations.HeatIndexDisplay;
import crypto.theblockchainpost.designpatterns.observer.implementations.StatisticsDisplay;
import crypto.theblockchainpost.designpatterns.observer.implementations.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        var currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        var statisticsDisplay = new StatisticsDisplay(weatherData);
        var heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(new WeatherDataValues(80, 65, 30.5));
        weatherData.setMeasurements(new WeatherDataValues(82, 70, 29.2));
        weatherData.setMeasurements(new WeatherDataValues(78, 90, 29.1));

    }

}
