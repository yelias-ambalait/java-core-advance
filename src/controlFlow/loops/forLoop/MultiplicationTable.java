package controlFlow.loops.forLoop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = scanner.nextInt();

        for (int i = 1; i<=size; i++) {
            for (int j = 1; j<=size; j++) {
                System.out.print( i * j+ "\t");
            }
            System.out.println();
        }
    }

}
