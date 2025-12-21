package A_plus;

import danhsachsinhvien1.SinhVien;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CreateInput {
    public static void main(String[] args) {
        ArrayList<SinhVien> danhSach = new ArrayList<>();

        try {
            // Thêm dữ liệu mẫu (Bạn có thể thêm tùy ý)
            danhSach.add(new SinhVien(1, "Nguyen Van An", "D20CQCN04-B", "02/02/2002", 3.2f));
            danhSach.add(new SinhVien(2, "Tran Thi Bich", "D20CQCN04-B", "15/10/2001", 3.55f));
            danhSach.add(new SinhVien(3, "Le Hoang Nam", "D20CQCN04-B", "1/1/2002", 2.8f));
            // Lưu ý: ngày 1/1/2002 ở trên sẽ tự động được Date format thành 01/01/2002 khi in ra

            // Ghi ra file SV.in
            FileOutputStream fos = new FileOutputStream("SV.in");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(danhSach);

            oos.close();
            fos.close();

            System.out.println("Da tao file SV.in thanh cong!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}