package J05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int n = cin.nextInt();
        ArrayList<Item> items = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            cin.nextLine();
            items.add(new Item(i, cin.nextLine(), cin.nextLine(), cin.nextInt(), cin.nextInt()));
        }
        Collections.sort(items);
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
