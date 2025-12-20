package J07036;

public class Score implements Comparable<Score> {
    private String id;
    private Student student;
    private Subject subject;
    private double value;

    public Score(Student student, Subject subject, double value) {
        this.student = student;
        this.subject = subject;
        this.value = value;
        this.id = student.getClss();
    }

    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        String s;
        if (value == (int) value){
            s = String.valueOf((int) value);
        }
        else s = String.valueOf(value);
        return student + " " + subject + " " + s;
    }

    @Override
    public int compareTo(Score o) {
        if (subject.compareTo(o.subject) != 0) return subject.compareTo(o.subject);
        return this.student.compareTo(o.student);
    }

}
