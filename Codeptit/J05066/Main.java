package J05066;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc số lượng nhân viên
        // Dùng sc.next() rồi sc.nextLine() cẩn thận hơn việc parse int ngay
        int n = sc.nextInt();

        List<Staff> staffs = new ArrayList<>();
        int gdCount = 0, tpCount = 0, ppCount = 0;

        for (int i = 0; i < n; i++) {
            String inputCode = sc.next();
            String name = sc.nextLine().trim();

            Staff s = new Staff(inputCode, name);
            String currentPos = s.getPos();

            // Xử lý logic chỉ tiêu (Quota)
            if (currentPos.equals("GD")) {
                if (gdCount < 1) {
                    gdCount++;
                } else {
                    s.setPos("NV");
                }
            } else if (currentPos.equals("TP")) {
                if (tpCount < 3) {
                    tpCount++;
                } else {
                    s.setPos("NV");
                }
            } else if (currentPos.equals("PP")) {
                if (ppCount < 3) {
                    ppCount++;
                } else {
                    s.setPos("NV");
                }
            }

            staffs.add(s);
        }

        // Sắp xếp danh sách (Logic đã viết trong class Staff)
        Collections.sort(staffs);

        // Xử lý truy vấn tìm kiếm
        int q = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng thừa sau số q

        while (q-- > 0) {
            String keyword = sc.nextLine().toLowerCase();

            for (Staff s : staffs) {
                if (s.getName().toLowerCase().contains(keyword)) {
                    System.out.println(s);
                }
            }
            // Chỉ in ĐÚNG 1 dòng trống sau mỗi nhóm kết quả
            System.out.println();
        }
    }
}