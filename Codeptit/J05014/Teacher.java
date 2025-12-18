package J05014;
public class Teacher implements Comparable<Teacher>{
    String id, name, subId;
    double bas, pro;

    public Teacher(int id, String name, String subId, double bas, double pro){
        this.id = String.format("GV%02d", id);
        this.name = name;
        this.subId = subId;
        this.bas = bas;
        this.pro = pro;
    }

    public double pre(){
        if(this.subId.charAt(1) == '1') return 2.0;
        else if (this.subId.charAt(1) == '2') return 1.5;
        else if (this.subId.charAt(1) == '3') return 1.0;
        else return 0.0;
    }

    public String sub(){
        if (this.subId.charAt(0) == 'A') return "TOAN";
        else if (this.subId.charAt(0) == 'B') return "LY";
        else return "HOA";
    }

    public double total(){
        return this.bas * 2 + this.pro + this.pre();
    }

    public String status(){
        if (this.total() >= 18) return "TRUNG TUYEN";
        else return "LOAI";
    }

    @Override
    public int compareTo(Teacher o){
        return Double.compare(o.total(), this.total());
    }

    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.sub() + " " + String.format("%.01f", this.total()) + " " + this.status();
    }
}
