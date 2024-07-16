package controlFlow.loops.whileLoop.stockPriceTracking;

import java.util.Random;

public class StockPriceTracker {
    public static void main(String[] args) {
        Random random  = new Random();
        double targetPrice = 150.0;
        double currentPrice = 100.0;

        while (currentPrice < targetPrice) {
            currentPrice += (random.nextDouble()-0.5) * 10;
            System.out.printf("Current stock price: $%.2f\n",currentPrice);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Target price reached. Current stock price: $"+currentPrice);
    }
}
