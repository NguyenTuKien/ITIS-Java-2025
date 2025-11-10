package J04005;

public class Student {
    private String name;
    private String dob;
    private float score;

    Student (String name, String dob, float score1, float score2, float score3) {
        this.name = name;
        this.dob = dob;
        this.score = score1 + score2 + score3;
    }

    @Override
    public String toString() {
        return name + " " + dob + " " + String.format("%.1f", score);
    }
}
