package J07010;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private final String id, name, clss;
    private final LocalDate dob;
    private final double gpa;

    Student(int id, String name, String clss, String dob, double gpa) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        this.id = String.format("B20DCCN%03d", id);
        this.name = name;
        this.clss = clss;
        this.dob = LocalDate.parse(dob, dtf);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return id + " " + name + " " + clss + " " + dob.format(dtf) + " " + df.format(gpa);
    }
}
