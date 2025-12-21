package J05073;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            Item item = new Item(sc.next(), sc.nextInt(), sc.nextInt());
            System.out.println(item);
        }
    }
}
