package Jobsheet15;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer> customer = new ArrayList<>(2);

        Customer customer1 = new Customer(1, "Zakia");
        Customer customer2 = new Customer(2, "Budi");

        customer.add(customer1);
        customer.add(customer2);

        customer.add(new Customer(4, "Cica"));

        customer.add(2, new Customer(100, "Rosa"));

        System.out.println(customer.indexOf(customer2));

        Customer customers = customer.get(1);
        System.out.println(customers.name);
        customers.name = "Budi Utomo";
    
        for (Customer c : customer) {
            System.out.println(c.toString());
        }

        ArrayList<Customer> newCustomers = new ArrayList<>();

        newCustomers.add(new Customer(201, "Della"));
        newCustomers.add(new Customer(202, "Victor"));
        newCustomers.add(new Customer(203, "Sarah"));

        customer.addAll(newCustomers);

        for (Customer c : customer) {
            System.out.println(c.toString());
        }

        System.out.println(customer);


        ArrayList<String> daftarSiswa = new ArrayList<>();

        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);

        System.out.println(daftarSiswa);

        customer.sort((c1, c2)->c1.name.compareTo(c2.name));

        System.out.println(customer);
    }
}
