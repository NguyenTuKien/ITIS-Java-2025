package danhsachsinhvien1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.Serializable;

public class SinhVien implements Serializable{
    private String ma, ten, lop;
    private Date ngaysinh ;
    private float gpa;

    public SinhVien(int ma, String ten, String lop, String ngaysinh , float gpa) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        this.ma = String.format("B20DCCN%03d", ma);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh  = df.parse(ngaysinh );
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return ma + " " + ten + " " + lop + " " + df.format(ngaysinh ) + " " + String.format("%.02f", gpa);
    }

}
