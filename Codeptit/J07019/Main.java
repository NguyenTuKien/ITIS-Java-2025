package J07019;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
//        Scanner itemIn = new Scanner(new File("C:\\Users\\Admin\\OneDrive\\Documents\\D23CT01_Java\\Codeptit\\J07019\\DATA1.in"));
//        Scanner billIn = new Scanner(new File("C:\\Users\\Admin\\OneDrive\\Documents\\D23CT01_Java\\Codeptit\\J07019\\DATA2.in"));
        Scanner itemIn = new Scanner(new File("DATA1.in"));
        Scanner billIn = new Scanner(new File("DATA2.in"));
        int n = itemIn.nextInt();
        Map<String, Item> items = new HashMap<>();
        for(int i = 0; i < n; ++i){
            itemIn.nextLine();
            Item item = new Item(itemIn.nextLine(), itemIn.nextLine(), itemIn.nextDouble(), itemIn.nextDouble());
            items.put(item.getId(), item);
        }
        n = billIn.nextInt();
        for (int i = 1; i <= n; ++i){
            String billId = billIn.next();
            String itemId = billId.substring(0, 2);
            String type = billId.substring(2, 3);
            int quantity = billIn.nextInt();
            Bill bill = new Bill(items.get(itemId), i, type, quantity);
            System.out.println(bill.toString());
        }
    }
}
