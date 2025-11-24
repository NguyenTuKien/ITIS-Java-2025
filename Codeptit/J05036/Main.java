package J05036;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        ArrayList <Item> items = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            items.add(new Item(i, cin.next(), cin.next(), cin.nextInt(), cin.nextInt()));
        }
        for (Item item : items){
            System.out.println(item.toString());
        }
    }
}
