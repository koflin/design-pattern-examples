package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Subject weatherData;

    private float temperature;
    private float humidity;

    CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Temp: %f, Humidity: %f\n", temperature, humidity);
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)subject;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
