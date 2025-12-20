package J05016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; ++i){
            Customer customer = new Customer(i, sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), Integer.parseInt(sc.nextLine()));
            customers.add(customer);
        }
        Collections.sort(customers);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
