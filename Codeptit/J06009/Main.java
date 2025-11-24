package J06009;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) throws Exception {
        Scanner KHin = new Scanner(new File("KH.in"));
        Scanner MHin = new Scanner(new File("MH.in"));
        Scanner HDin = new Scanner(new File("HD.in"));

        int n = KHin.nextInt();
        KHin.nextLine();
        HashMap <String, Client> clients = new HashMap<>();
        for (int i = 1; i <= n; ++i){
            Client client = new Client(i, KHin.nextLine(), KHin.nextLine(), KHin.nextLine(), KHin.nextLine());
            clients.put(client.getId(), client);
        }
        n = MHin.nextInt();
        MHin.nextLine();
        HashMap <String, Item> items = new HashMap<>();
        for (int i = 1; i <= n; ++i){
            Item item = new Item(i, MHin.nextLine(), MHin.nextLine(), MHin.nextInt(), MHin.nextInt());
            MHin.nextLine();
            items.put(item.getId(), item);
        }
        n = HDin.nextInt();
        HDin.nextLine();
        ArrayList <Invoice> invoices = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String clientId = HDin.next();
            String itemId = HDin.next();
            int quantity = HDin.nextInt();
            invoices.add(new Invoice(i, clients.get(clientId), items.get(itemId), quantity));
        }
        for (Invoice invoice : invoices){
            System.out.println(invoice.toString());
        }
    }
}
