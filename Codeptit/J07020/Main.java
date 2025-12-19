package J07020;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner cin = new Scanner(new File("KH.in"));
        int n =  cin.nextInt();
        cin.nextLine();
        Map<String, Customer> customers = new HashMap<>();
        for (int i = 1; i <= n; ++i){
            Customer customer = new Customer(i, cin.nextLine(), cin.nextLine(), cin.nextLine(), cin.nextLine());
            customers.put(customer.getId(), customer);
        }
        cin = new Scanner(new File("MH.in"));
        n = cin.nextInt();
        Map<String, Item> items = new HashMap<>();
        for (int i = 1; i <= n; ++i){
            cin.nextLine();
            Item item = new Item(i, cin.nextLine(), cin.nextLine(), cin.nextInt(), cin.nextInt());
            items.put(item.getId(), item);
        }
        cin = new Scanner(new File("HD.in"));
        n =  cin.nextInt();
        for (int i = 1; i <= n; ++i){
            Bill bill = new Bill(i, customers.get(cin.next()), items.get(cin.next()), cin.nextInt());
            System.out.println(bill);
        }
    }
}
