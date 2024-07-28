package string.sortingCustomerName;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerSorter customerSorter = new CustomerSorter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer name:");
        for(int i = 0; i<10; i++) {
            String customer = scanner.nextLine();
            customerSorter.addCustomer(customer);
        }
//        customerSorter.addCustomer("Adam");
//        customerSorter.addCustomer("Nuh");
//        customerSorter.addCustomer("Sheesh");
//        customerSorter.addCustomer("Lut");
//        customerSorter.addCustomer("Daud");
//        customerSorter.addCustomer("Solaiman");
//        customerSorter.addCustomer("Musa");
//        customerSorter.addCustomer("Harun");
//        customerSorter.addCustomer("Isa");

        System.out.println("Customer before sorting: ");
        customerSorter.getCustomer();

        customerSorter.sortCustomer();
        System.out.println("Customer after sorting: ");
        customerSorter.getCustomer();
    }
}
