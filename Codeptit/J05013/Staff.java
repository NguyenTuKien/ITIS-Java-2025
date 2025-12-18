package J05013;
public class Staff implements Comparable<Staff>{
    String name, id;
    double practice, theory;

    public Staff(int id, String name, double theory, double practice) {
        this.id = String.format("TS%02d", id);
        this.name = name;
        this.theory = this.score(theory);
        this.practice = this.score(practice);
    }

    double score(double x){
        if(x <= 10) return x;
        else return x / 10;
    }

    double avg(){
        return (practice + theory) / 2;
    }

    String status(){
        if(this.avg() >= 9.5){
            return "XUAT SAC";
        }
        else if(this.avg() >= 8){
            return "DAT";
        }
        else if(this.avg() >= 5){
            return "CAN NHAC";
        }
        else {
            return "TRUOT";
        }
    }

    @Override
    public int compareTo(Staff o) {
        return Double.compare(o.avg(), this.avg());
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + String.format("%.2f", this.avg()) + " " + this.status();
    }
}
