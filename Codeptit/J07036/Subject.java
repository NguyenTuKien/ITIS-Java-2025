package J07036;

public class Subject implements Comparable<Subject> {
    private String id, name;
    private int credit;
    public Subject(String id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }
    public String getId() {
        return id;
    }

    @Override
    public int compareTo(Subject o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
