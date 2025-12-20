package J07047;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Bill implements Comparable<Bill> {
    private String id, name, room;
    private Type type;
    private LocalDate arrival, departure;
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public Bill(int id, String name, String room, Type type, String arrival, String departure) {
        this.id = String.format("KH%02d", id);
        this.name = name;
        this.room = room;
        this.type = type;
        this.arrival = LocalDate.parse(arrival, dtf);
        this.departure = LocalDate.parse(departure, dtf);
    }
    public long getDays(){
        return ChronoUnit.DAYS.between(arrival, departure);
    }
    public double getTotal(){
        long days = Math.max(getDays(), 1);
        double total =  days * type.getPrice() * (1 + type.getFee());
        if (days > 30) return total * 0.94;
        else if (days >= 20) return total * 0.96;
        else if (days >= 10) return total * 0.98;
        else return total;
    }
    @Override
    public int compareTo(Bill o) {
        return Long.compare(o.getDays(), this.getDays());
    }
    @Override
    public String toString() {
        return String.format(String.format(id + " " + name + " " + room + " " + getDays() + " " + String.format("%.2f", getTotal())));
    }
}
