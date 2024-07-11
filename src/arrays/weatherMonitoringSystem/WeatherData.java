package arrays.weatherMonitoringSystem;

import java.util.Random;

public class WeatherData {
    private double[][] temperatureData;
    private double[][] humidityData;
    private double[][] windSpeedData;
    int numberOfSensors;
    int numberOfReading;

    public WeatherData(int numberOfSensors, int numberOfReading){
        this.numberOfSensors = numberOfSensors;
        this.numberOfReading = numberOfReading;
        this.temperatureData = new double[numberOfSensors][numberOfReading];
        this.humidityData = new double[numberOfSensors][numberOfReading];
        this.windSpeedData = new double[numberOfSensors][numberOfReading];
    }

    public double[][] getTemperatureData() {
        return temperatureData;
    }

    public double[][] getHumidityData() {
        return humidityData;
    }

    public double[][] getWindSpeedData() {
        return windSpeedData;
    }

    public void populateData(){
        Random random = new Random();
        for(int i = 0; i< numberOfSensors; i++){
            for (int j = 0; j< numberOfReading; j++){
                temperatureData[i][j] = 8+ random.nextDouble() * (41-8);
                humidityData[i][j] = random.nextDouble() * 100;
                windSpeedData[i][j] = random.nextDouble() * 15;
            }
        }
    }
}
