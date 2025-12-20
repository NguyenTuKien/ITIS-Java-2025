package J07049;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
//        Scanner sc = new Scanner(new File("J07049/MUAHANG.in"));
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = sc.nextInt();
        Map<String, Item> items = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            Item item = new Item(sc.nextLine().trim(), sc.nextLine().trim(), sc.nextInt(), sc.nextInt());
            items.put(item.getId(), item);
        }
        n = sc.nextInt();
        sc.nextLine();
        List<Bill> bills = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Bill bill = new Bill(i, sc.nextLine(), sc.nextLine(), items.get(sc.nextLine().trim()), Integer.parseInt(sc.nextLine().trim()), sc.nextLine().trim());
            bills.add(bill);
        }
        Collections.sort(bills);
        for (Bill bill : bills) {
            System.out.println(bill);
        }
    }
}
