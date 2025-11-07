package display;

import observer.Observer;

public class ForecastDisplay implements Observer {
    private float lastPressure;
    private float currentPressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    private void display() {
        if (lastPressure == 0) {
            System.out.println("Forecast: waiting for more data");
        } else if (currentPressure > lastPressure) {
            System.out.println("Forecast: improving weather");
        } else if (currentPressure < lastPressure) {
            System.out.println("Forecast: possible rain");
        } else {
            System.out.println("Forecast: stable");
        }
    }
}
