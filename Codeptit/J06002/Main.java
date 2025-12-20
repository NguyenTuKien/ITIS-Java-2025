package J06002;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Map<String, Item> items = new HashMap<>();
        for (int i = 1; i <= n; ++i){
            cin.nextLine();
            Item item = new Item(cin.nextLine(), cin.nextLine(), cin.nextInt(), cin.nextInt());
            items.put(item.getId(), item);
        }
        int m = cin.nextInt();
        List<Bill> bills = new ArrayList<>();
        for (int i = 1; i <= m; ++i){
            String id = cin.next();
            int quantity = cin.nextInt();
            Bill bill = new Bill(i, id.substring(2), items.get(id.substring(0, 2)), quantity);
            bills.add(bill);
        }
        Collections.sort(bills);
        for (Bill bill : bills){
            System.out.println(bill);
        }
    }
}
