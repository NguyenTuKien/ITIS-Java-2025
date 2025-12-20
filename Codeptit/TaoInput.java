import java.io.*;
import java.util.*;

public class TaoInput {
    public static void main(String[] args) throws IOException {
        // Tạo list 1
        ArrayList<Integer> list1 = new ArrayList<>();
        // Thêm các số thỏa mãn (Thuận nghịch, toàn lẻ, độ dài lẻ > 1)
        list1.add(313); list1.add(313); // 313 xuất hiện 2 lần
        list1.add(555);
        list1.add(717);
        list1.add(939);
        list1.add(13531); // 5 chữ số

        // Thêm các số KHÔNG thỏa mãn để bẫy
        list1.add(101); // Có số 0 (chẵn)
        list1.add(22);  // Số chẵn
        list1.add(11);  // Độ dài chẵn (2)
        list1.add(3);   // Độ dài 1 (không lớn hơn 1)
        list1.add(12321); // Có số 2 (chẵn)

        // Ghi file 1
        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("DATA1.in"));
        oos1.writeObject(list1);
        oos1.close();

        // Tạo list 2
        ArrayList<Integer> list2 = new ArrayList<>();
        // Các số trùng với file 1
        list2.add(313); // Tổng cộng 313 sẽ xuất hiện 3 lần
        list2.add(555);
        list2.add(717);
        list2.add(939);
        list2.add(13531);

        // Số mới thỏa mãn
        list2.add(999);

        // Ghi file 2
        ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
        oos2.writeObject(list2);
        oos2.close();

        System.out.println("Đã tạo xong file DATA1.in và DATA2.in");
    }
}