package J07013;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> sinhViens = (ArrayList<SinhVien>) ois.readObject();
        for (SinhVien sinhVien : sinhViens){
            System.out.println(sinhVien);
        }

    }
}
