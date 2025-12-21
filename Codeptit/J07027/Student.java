package J07027;

public class Student implements Comparable<Student>{
    private String id, name, phone;

    public Student(String id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getId(){ return id; }

    @Override
    public String toString(){
        return id + " " + name + " " + phone;
    }

    @Override
    public int compareTo(Student o){
        return id.compareTo(o.id);
    }
}
