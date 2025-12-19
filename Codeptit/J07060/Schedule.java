package J07060;

public class Schedule implements Comparable<Schedule> {
    Shift shift;
    Subject subject;
    int groupId, quantity;

    public Schedule(Shift shift, Subject subject, int groupId, int quantity) {
        this.shift = shift;
        this.subject = subject;
        this.groupId = groupId;
        this.quantity = quantity;
    }

    public Shift getShift() {
        return shift;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public int compareTo(Schedule schedule) {
        if (this.shift.equals(schedule.getShift())) {
            return this.subject.compareTo(schedule.subject);
        }
        return this.shift.compareTo(schedule.getShift());
    }

    @Override
    public String toString() {
        return shift + " " + subject + " " +  String.format("%02d", groupId) + " " + quantity;
    }
}
