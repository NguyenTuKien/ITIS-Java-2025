package J05012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t =  cin.nextInt();
        List<Bill> bills = new ArrayList<Bill>();
        while(t-- > 0){
            cin.nextLine();
            bills.add(new Bill(cin.nextLine(), cin.nextLine(), cin.nextInt(), cin.nextLong(), cin.nextLong()));
        }
        Collections.sort(bills);
        for(Bill bill : bills){
            System.out.println(bill);
        }
    }
}
