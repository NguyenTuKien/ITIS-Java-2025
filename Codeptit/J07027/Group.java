package J07027;

public class Group implements Comparable<Group>{
    private Student student;
    private Topic topic;

    public Group(Student student, Topic topic){
        this.student = student;
        this.topic = topic;
    }

    @Override
    public int compareTo(Group o){
        return student.compareTo(o.student);
    }

    @Override
    public String toString(){
        return student + " " + topic;
    }
}
