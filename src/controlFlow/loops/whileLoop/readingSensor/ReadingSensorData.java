package controlFlow.loops.whileLoop.readingSensor;

import java.util.Random;

public class ReadingSensorData {
    public static void main(String[] args) {
        Random random  = new Random();
        boolean isReading = true;

        while (isReading) {
            int temperature = readTemperatureSensorData(random);
            System.out.println("Current temperature: " + temperature);

            if (temperature>35) {
                System.out.println("Temperature exceeded threshold. Stop sensor reading.");
                isReading = false;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static int readTemperatureSensorData(Random random) {
        return random.nextInt(40);
    }
}
