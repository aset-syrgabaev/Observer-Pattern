package observer.app;

import observer.display.CurrentConditionsDisplay;
import observer.display.ForecastDisplay;
import observer.Observer;
import observer.WeatherStation;

public class WeatherDemo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Observer current = new CurrentConditionsDisplay();
        Observer forecast = new ForecastDisplay();

        station.addObserver(current);
        station.addObserver(forecast);

        station.setMeasurements(20.5f, 65f, 1012f);
        station.setMeasurements(22.0f, 60f, 1015f);
        station.setMeasurements(19.0f, 70f, 1008f);

        station.removeObserver(forecast);
        station.setMeasurements(18.0f, 75f, 1005f);
    }
}
