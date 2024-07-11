package arrays.weatherMonitoringSystem;

public class WeatherMonitoringSystem {

    public static void main(String[] args) {
        int numberOfSensors = 10;
        int numberOfReading = 24;

        WeatherData weatherData = new WeatherData(numberOfSensors, numberOfReading);

        weatherData.populateData();

        WeatherAnalyzer analyzer = new WeatherAnalyzer(weatherData);
        analyzer.printDailyWeatherSummary();
    }
}
