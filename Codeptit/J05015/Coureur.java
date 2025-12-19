package J05015;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Coureur implements Comparable<Coureur> {
    String id, name, dept;
    LocalTime end;
    static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m");

    public Coureur(String name, String dept, String end) throws ParseException {
        this.name = name;
        this.dept = dept;
        this.end = LocalTime.parse(end, dtf);
        this.id = setId();
    }

    public String setId(){
        StringBuilder builder = new StringBuilder();
        for (String word : dept.split(" ")) {
            builder.append(word.charAt(0));
        }
        for (String word : name.split(" ")) {
            builder.append(word.charAt(0));
        }
        return builder.toString();
    }

    public double getV(){
        double difTime = Math.abs(Duration.between(end, LocalTime.parse("06:00")).toMinutes());
        return 120 * 60 * 1.0 / difTime;
    }

    @Override
    public int compareTo(Coureur o) {
        return Double.compare(o.getV(), this.getV());
    }

    @Override
    public String toString() {
        return id + " " + name + " " + dept + " " + String.format("%.0f Km/h", getV());
    }
}
