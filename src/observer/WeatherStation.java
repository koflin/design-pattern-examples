package observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(21, 70, 30);

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setTemperature(30);
        weatherData.setHumidity(29.2f);
        weatherData.setTemperature(-1.0f);
    }
}
