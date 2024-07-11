package arrays.weatherMonitoringSystem;

public class WeatherAnalyzer {
    private WeatherData weatherData;

    public WeatherAnalyzer(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public double calculateAverage(double[][] data) {
        double total = 0;
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
                count++;
            }
        }
        return total / count;
    }

    public double findMax(double[][] data) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
        }
        return max;
    }

    public double findMin(double[][] data) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] < min) {
                    min = data[i][j];
                }
            }
        }
        return min;
    }

    public void printDailyWeatherSummary() {

        double[][] temperatureData = weatherData.getTemperatureData();
        double[][] humidityData = weatherData.getHumidityData();
        double[][] windSpeedData = weatherData.getWindSpeedData();

        System.out.println("Daily Weather Summary:");
        System.out.printf("Average Temperature: %.3f °C", calculateAverage(temperatureData));
        System.out.printf("\nAverage Humidity: %.3f g/m3", calculateAverage(humidityData));
        System.out.printf("\nAverage WindSpeed: %.3f m/s", calculateAverage(windSpeedData));
        System.out.printf("\nMaximum Temperature: %.3f °C", findMax(temperatureData));
        System.out.printf("\nMinimum Temperature: %.3f °C", findMin(temperatureData));
        System.out.printf("\nMaximum Humidity: %.3f g/m3", findMax(humidityData));
        System.out.printf("\nMinimum Humidity: %.3f g/m3", findMin(humidityData));
        System.out.printf("\nMaximum Wind Speed: %.3f m/s", findMax(windSpeedData));
        System.out.printf("\nMinimum Wind Speed: %.3f m/s", findMin(windSpeedData));
    }
}