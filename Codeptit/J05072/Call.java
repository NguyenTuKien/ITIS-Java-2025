package J05072;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;

public class Call implements Comparable<Call>{
    private String phone;
    private LocalTime start, end;
    private Area area;
    private final DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm");
    public Call(String phone, String start, String end, Area area){
        this.phone = phone;
        this.start = LocalTime.parse(start, tf);
        this.end = LocalTime.parse(end, tf);
        this.area = area;
    }
    public Call(String phone, String start, String end){
        this.phone = phone;
        this.start = LocalTime.parse(start, tf);
        this.end = LocalTime.parse(end, tf);
        this.area = new Area(null, "Noi mang", 800);
    }
    public long getDuration(){
        long duration = ChronoUnit.MINUTES.between(start, end);
        if (area.getName().equals("Noi mang")) return (long) Math.ceil(1.0 * duration / 3);
        return duration;
    }
    public long getCost(){
        return getDuration() * area.getPrice();
    }
    @Override
    public String toString(){
        return phone + " " + area.getName() + " " + getDuration() + " " + getCost();
    }
    @Override
    public int compareTo(Call o){
        return Long.compare(o.getCost(), getCost());
    }
}
