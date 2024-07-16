package controlFlow.loops.forLoop.salesAnalysis;

public class MonthlySalesManagementSystem {
    public static void main(String[] args) {
        double[] monthlySales = {1000.50, 1250.0, 1500, 2500, 2800, 1100, 950, 816.55, 1300};
        double totalSales = 0;

        for (int i = 0; i < monthlySales.length; i++) {
            totalSales += monthlySales[i];
        }
        System.out.println("Total sales amount: "+totalSales+ "$");

        double averageSales = totalSales/monthlySales.length;
        System.out.printf("Average monthly sales amount: %.3f$",averageSales);
    }
}
