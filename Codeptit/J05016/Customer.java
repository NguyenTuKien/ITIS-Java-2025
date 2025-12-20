package J05016;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Customer implements Comparable<Customer>{
    private String id, name, roomId;
    private LocalDate arrivalDate, returnDate;
    private int fee;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Customer(int id, String name, String roomId, String arrivalDate, String returnDate, int fee) {
        this.id = String.format("KH%02d", id);
        this.name = name;
        this.roomId = roomId;
        this.arrivalDate = LocalDate.parse(arrivalDate, dtf);
        this.returnDate = LocalDate.parse(returnDate, dtf);
        this.fee = fee;
    }

    public long getDiffDate(){
        return ChronoUnit.DAYS.between(arrivalDate, returnDate) + 1;
    }

    public long getTotal(){
        long total = getDiffDate();
        if (roomId.charAt(0) == '1') total *= 25;
        if (roomId.charAt(0) == '2') total *= 34;
        if (roomId.charAt(0) == '3') total *= 50;
        if (roomId.charAt(0) == '4') total *= 80;
        return total + fee;
    }

    @Override
    public int compareTo(Customer o) {
        return Long.compare(o.getTotal(), this.getTotal());
    }

    @Override
    public String toString(){
        return id + " " + name + " " + roomId + " " + getDiffDate() + " " + getTotal();
    }
}
