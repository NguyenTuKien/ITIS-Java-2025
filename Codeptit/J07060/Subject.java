package J07060;

public class Subject implements Comparable<Subject> {
    String id, name, details;

    public Subject(String id, String name, String details) {
        this.id = id;
        this.name = name;
        this.details = details;
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(Subject subject) {
        return this.name.compareTo(subject.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
