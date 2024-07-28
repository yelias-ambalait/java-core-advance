package string.sortingCustomerName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerSorter {
    private List<Customer> customers;

    public CustomerSorter() {
        customers = new ArrayList<>();
    }

    public void addCustomer(String customer) {
        customers.add(new Customer(customer));
    }
    public void sortCustomer() {
        Collections.sort(customers, new Comparator<Customer>(){
            @Override
            public int compare(Customer c1, Customer c2) {
                return c1.getName().compareTo(c2.getName());
            }
        });
    }
    public void getCustomer(){
        for (Customer customer : customers) {
            System.out.println(customer.getName());
        }
    }
}

