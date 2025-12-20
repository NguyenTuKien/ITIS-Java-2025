package J07047;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
//        Scanner sc = new Scanner(new File("J07047/DATA.in"));
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt();
        Map<String, Type> types = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            Type type = new Type(sc.next().trim(), sc.next().trim(), sc.nextInt(), sc.nextDouble());
            types.put(type.getId(), type);
        }
        n = sc.nextInt();
        sc.nextLine();
        List<Bill> bills = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String name = sc.nextLine();
            String room = sc.nextLine();
            Type type = types.get(room.substring(2, 3));
            String arrival = sc.nextLine();
            String departure = sc.nextLine();
            Bill bill = new Bill(i, name, room, type, arrival, departure);
            bills.add(bill);
        }
        Collections.sort(bills);
        for (Bill bill : bills) {
            System.out.println(bill);
        }
    }
}
