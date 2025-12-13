package Bai2;

import java.text.DecimalFormat;

public class SV {
    DecimalFormat df = new DecimalFormat("#.#");
    private String id;
    private String name;
    private String dt;
    private double toan, ly, hoa;
    private int giaiQG;

    SV (String id, String name, String dt, double toan, double ly, double hoa, int giaiQG){
        this.id = id;
        this.name = name;
        this.dt = dt;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.giaiQG = giaiQG;
    }

    public double getGiaiQG(){
        if (giaiQG == 1) return 1.5;
        else if (giaiQG == 2) return 1.0;
        else if (giaiQG == 3) return 0.5;
        else return 0.0;
    }

    public double getDiemKV(){
        if (id.substring(0, 3).equals("KV2")) return 1.0;
        else if (id.substring(0, 3).equals("KV3")) return 2.0;
        else return 0.0;
    }

    public double getDiemDT(){
        if (dt.equals("kinh") || dt.equals("Kinh")) return 0.0;
        else return 1.0;
    }

    public double getDiemUT(){
        return getGiaiQG() + getDiemDT() + getDiemKV();
    }

    public double getDiemTong(){
        return toan + ly + hoa;
    }

    public String trungTuyen(){
        if(getDiemUT() + getDiemTong() >= 26.8) return "TRUNG TUYEN";
        else return "TRUOT";
    }

    public String toString(){
        return id + " " + name + " " + df.format(getDiemUT()) + " " + df.format(getDiemTong()) + " " + trungTuyen();
    }
}
