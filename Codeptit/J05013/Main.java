package J05013;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Staff> staffs = new ArrayList<Staff>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            staffs.add(new Staff(i + 1, sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(staffs);
        for (Staff staff : staffs) {
            System.out.println(staff);
        }
    }
}
