package J05003;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<SinhVien> danhSach = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien();
            sv.nhapThongTin(sc);
            danhSach.add(sv);
        }

        for (SinhVien sv : danhSach) {
            System.out.println(sv);
        }

        sc.close();
    }

}
