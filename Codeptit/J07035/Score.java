package J07035;

public class Score implements Comparable<Score> {
    private Student student;
    private Subject subject;
    private double value;

    public Score(Student student, Subject subject, double value) {
        this.student = student;
        this.subject = subject;
        this.value = value;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public int compareTo(Score o) {
        if (this.value != o.value) {
            return Double.compare(o.value, this.value);
        }
        return this.student.getId().compareTo(o.student.getId());
    }

    @Override
    public String toString() {
        String markStr;
        if (value == (int) value) {
            markStr = String.format("%d", (int) value);
        } else {
            markStr = String.format("%s", value);
        }
        return student.getId() + " " + student.getName() + " " + student.getClss() + " " + markStr;
    }
}