package observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private Subject weatherData;

    private float tempTotal;
    private int tempValues;

    private float tempMax;
    private float tempMin;

    StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

        this.tempTotal = weatherData.getTemperature();
        this.tempValues = 1;

        this.tempMax = this.tempTotal;
        this.tempMin = this.tempTotal;
    }

    @Override
    public void display() {
        System.out.printf("Avg: %f, Max: %f, Min: %f\n", tempTotal / tempValues, tempMax, tempMin);
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)subject;
            float temp = weatherData.getTemperature();

            tempTotal += temp;
            tempValues ++;

            if (temp > tempMax) this.tempMax = temp;
            if (temp < tempMin) this.tempMin = temp;

            display();
        }
    }
}
