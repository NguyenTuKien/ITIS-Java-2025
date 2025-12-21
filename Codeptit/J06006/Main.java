package J06006;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner cin = new Scanner(System.in);
        Map<String, Customer> customers = new HashMap<>();
        int n = cin.nextInt();
        cin.nextLine();
        for (int i = 1; i <= n; ++i){
            Customer customer = new Customer(i, cin.nextLine(), cin.nextLine(), cin.nextLine(), cin.nextLine());
            customers.put(customer.getId(), customer);
        }
        n = cin.nextInt();
        Map<String, Item> items = new HashMap<>();
        for (int i = 1; i <= n; ++i){
            cin.nextLine();
            Item item = new Item(i, cin.nextLine(), cin.nextLine(), cin.nextInt(), cin.nextInt());
            items.put(item.getId(), item);
        }
        n = cin.nextInt();
        List<Invoice> invoices = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            Invoice invoice = new Invoice(i, customers.get(cin.next()), items.get(cin.next()), cin.nextInt());
            invoices.add(invoice);
        }
        Collections.sort(invoices);
        for (Invoice invoice : invoices){
            System.out.println(invoice.toString());
        }
    }
}
