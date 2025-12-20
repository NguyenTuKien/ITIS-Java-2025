package J05066;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntGD = 0, cntTP = 0, cntPP = 0;
        int n = Integer.parseInt(sc.nextLine()); // Đọc cả dòng
        List<Staff> staffs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split("\\s+", 2);
            String code = parts[0];
            String name = parts[1];

            String pos = code.substring(0, 2);
            if (pos.equals("GD")) {
                if (cntGD == 0) {
                    cntGD++;
                } else {
                    code = "NV" + code.substring(2);
                    pos = "NV"; // Cập nhật lại pos
                }
            } else if (pos.equals("TP")) {
                if (cntTP < 3) {
                    cntTP++;
                } else {
                    code = "NV" + code.substring(2);
                    pos = "NV"; // Cập nhật lại pos
                }
            } else if (pos.equals("PP")) {
                if (cntPP < 3) {
                    cntPP++;
                } else {
                    code = "NV" + code.substring(2);
                    pos = "NV"; // Cập nhật lại pos
                }
            }
            staffs.add(new Staff(code, name));
        }

        Collections.sort(staffs);

        int m = Integer.parseInt(sc.nextLine()); // Đọc cả dòng
        for (int i = 0; i < m; i++) {
            String keyword = sc.nextLine().trim().toLowerCase();
            boolean found = false;
            for (Staff staff : staffs) {
                if (staff.getName().toLowerCase().contains(keyword)) {
                    System.out.println(staff);
                    found = true;
                }
            }
            if (!found) {
                System.out.println();
            }
            System.out.println(); // In dòng trống sau mỗi truy vấn
        }
    }
}
