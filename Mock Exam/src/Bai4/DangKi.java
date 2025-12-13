package Bai4;

public class DangKi {
    private final SinhVien sinhVien;
    private final char size;

    DangKi(SinhVien sinhVien, char size){
        this.sinhVien = sinhVien;
        this.size = size;
    }

    @Override
    public String toString(){
        return sinhVien.toString();
    }
}
