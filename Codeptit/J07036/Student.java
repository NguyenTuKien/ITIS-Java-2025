package J07036;

public class Student implements Comparable<Student>{
    private String id, name, clss, email;

    public Student(String id, String name, String clss, String email){
        this.id = id;
        this.name = normalize(name);
        this.clss = clss;
        this.email = email;
    }

    String normalize(String name){
        StringBuilder sb = new StringBuilder();
        String[] words = name.split("\\s+");
        for (String word : words) {
            if (word.isEmpty()) continue;
            word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }

    public String getId(){
        return id;
    }

    public String getClss(){
        return clss;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Student o){
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString(){
        return id + " " + name;
    }
}

