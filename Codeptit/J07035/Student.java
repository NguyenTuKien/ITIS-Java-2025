package J07035;

public class Student {
    private String id, name, clss, email;

    public Student(String id, String name, String clss, String email) {
        this.id = id;
        this.clss = clss;
        this.email = email;
        String[] tmp = name.trim().toLowerCase().split("\\s+");
        this.name = tmp[0].substring(0, 1).toUpperCase() + tmp[0].substring(1);
        for (int i = 1; i < tmp.length; ++i) {
            this.name += (" " + tmp[i].substring(0, 1).toUpperCase() + tmp[i].substring(1));
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClss() {
        return clss;
    }
}