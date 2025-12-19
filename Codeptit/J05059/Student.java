package J05059;

import java.text.DecimalFormat;

public class Student implements Comparable<Student> {
    String id, name;
    double math, phy, chem;
    final DecimalFormat df = new DecimalFormat("#.#");
    public Student(String id, String name, double math, double phy, double chem) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.phy = phy;
        this.chem = chem;
    }

    public double getBonus(){
        String area = id.substring(0, 3);
        if (area.equals("KV3")) return 2.5;
        else if (area.equals("KV2")) return 1.0;
        else return 0.5;
    }

    public double getTotal(){
        return math * 2 + phy + chem + getBonus();
    }

    @Override
    public int compareTo(Student o) {
        if (o.getTotal() != this.getTotal()) return Double.compare(o.getTotal(), this.getTotal());
        else return this.id.compareTo(o.id);
    }

    @Override
    public String toString(){
        return id + " " + name + " " + df.format(getBonus()) + " " +  df.format(getTotal());
    }
}
