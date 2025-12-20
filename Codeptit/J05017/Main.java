package J05017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        List<Customer> customers = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            cin.nextLine();
            Customer customer = new Customer(i, cin.nextLine(), cin.nextInt(), cin.nextInt());
            customers.add(customer);
        }
        Collections.sort(customers);
        for (Customer customer : customers){
            System.out.println(customer);
        }

    }
}
