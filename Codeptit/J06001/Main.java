package J06001;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Item> items = new HashMap<>();
        for (int i = 1; i <= n; ++i){
            Item item = new Item(sc.nextLine().trim(), sc.nextLine().trim(), Integer.parseInt(sc.nextLine().trim()), Integer.parseInt(sc.nextLine().trim()));
            items.put(item.getId(), item);
        }
        n =  Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; ++i){
            String id = sc.next();
            Item item = items.get(id.substring(0, 2));
            String type = id.substring(2, 3);
            int quantity = sc.nextInt();
            Bill bill = new Bill(i, type, item, quantity);
            System.out.println(bill);
        }

    }
}
