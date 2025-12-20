package J05019;

import java.lang.annotation.Documented;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Detail implements Comparable<Detail>{
    private String id, address;
    private long totalTime;
    private double totalAmount;


    private final DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm");

    public Detail(int id, String address){
        this.id = String.format("T%02d", id);
        this.address = address;
        this.totalAmount = 0;
        this.totalTime = 0;
    }

    public void update(String start, String end, double amount){
        long difTime = ChronoUnit.MINUTES.between(LocalTime.parse(start, tf), LocalTime.parse(end, tf));
        totalTime += difTime;
        totalAmount += amount;
    }

    public String getAddress(){
        return address;
    }

    public double getAvg(){
        return totalAmount * 60 / totalTime;
    }

    @Override
    public String toString(){
        return id + " " + address + " " + String.format("%.02f", getAvg());
    }

    @Override
    public int compareTo(Detail o){
        return id.compareTo(o.id);
    }
}
