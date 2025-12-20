package J05062;

import java.util.*;

class Student implements Comparable<Student>{
    private String name, type;
    private double gpa;
    private int drl;

    public Student(String name, double gpa, int drl) {
        this.name = name;
        this.gpa = gpa;
        this.drl = drl;
        if (gpa >= 3.6 && drl >= 90) type = "XUATSAC";
        else if (gpa >= 3.2 && drl >= 80) type = "GIOI";
        else if (gpa >= 2.5 && drl >= 70) type = "KHA";
        else type = "KHONG";
    }

    public double getGpa() {
        return gpa;
    }

    public String getType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int compareTo(Student o){
        if (Double.compare(gpa, o.gpa) != 0) return Double.compare(o.gpa, gpa);
        return o.drl - drl;
    }

    @Override
    public String toString(){
        return name + ": " + type;
    }
}
