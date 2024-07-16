package controlFlow.loops.whileLoop;

import java.util.Scanner;

public class CountDownTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter countDown time: ");
        int countDown = scanner.nextInt();

        while(countDown>=0) {
            System.out.println("Time left: "+countDown+ " seconds");
            countDown--;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
