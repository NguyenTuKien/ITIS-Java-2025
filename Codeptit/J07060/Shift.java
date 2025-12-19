package J07060;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Shift implements Comparable<Shift> {
    LocalDate date;
    LocalTime time;
    String id, room;

    static final DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static final DateTimeFormatter tf =  DateTimeFormatter.ofPattern("HH:mm");

    public Shift(int id, String date, String time, String room) {
        this.id = String.format("C%03d", id);
        this.date = LocalDate.parse(date, df);
        this.time = LocalTime.parse(time, tf);
        this.room = room;
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(Shift shift) {
        if (this.date.isEqual(shift.date)) {
            return this.time.compareTo(shift.time);
        }
        return this.date.compareTo(shift.date);
    }

    @Override
    public String toString() {
        return df.format(date) + " " + tf.format(time) + " " + this.room;
    }
}
