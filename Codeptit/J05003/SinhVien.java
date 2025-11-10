package J05003;

import java.util.Scanner;

public class SinhVien {
    private static int count = 0; // Biến đếm tĩnh để tự động tăng mã SV
    private String maSV;
    private String hoTen;
    private String ngaySinh;
    private String lop;
    private double gpa;

    // Hàm khởi tạo không tham số - gán giá trị mặc định
    public SinhVien() {
        this.maSV = "";
        this.hoTen = "";
        this.ngaySinh = "";
        this.lop = "";
        this.gpa = 0.0;
    }

    // Phương thức nhập thông tin sinh viên
    public void nhapThongTin(Scanner sc) {
        count++; // Tăng biến đếm
        this.maSV = String.format("B20DCCN%03d", count); // Tạo mã SV tự động

        this.hoTen = sc.nextLine();
        this.lop = sc.nextLine();

        String ngaySinhInput = sc.nextLine();
        this.ngaySinh = chuanHoaNgaySinh(ngaySinhInput);

        this.gpa = sc.nextDouble();
        if (sc.hasNextLine()) {
            sc.nextLine(); // Đọc bỏ ký tự xuống dòng
        }
    }

    // Phương thức chuẩn hóa ngày sinh về dạng dd/mm/yyyy
    private String chuanHoaNgaySinh(String ngay) {
        String[] parts = ngay.trim().split("/");
        int ngayInt = Integer.parseInt(parts[0]);
        int thangInt = Integer.parseInt(parts[1]);
        int namInt = Integer.parseInt(parts[2]);

        return String.format("%02d/%02d/%04d", ngayInt, thangInt, namInt);
    }

    // Phương thức toString để in thông tin sinh viên
    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f",
                maSV, hoTen, lop, ngaySinh, gpa);
    }

}
