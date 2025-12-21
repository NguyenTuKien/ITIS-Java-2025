package J07027;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("BAITAP.in"));
        Scanner sc3 = new Scanner(new File("NHOM.in"));
        Map<String, Student> students = new HashMap<>();
        Map<Integer, Topic> topics = new HashMap<>();
        List<Group> groups = new ArrayList<>();
        int n = sc1.nextInt();
        sc1.nextLine();
        while(n-- > 0){
            Student student = new Student(sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            students.put(student.getId(), student);
        }
        n = sc2.nextInt();
        sc2.nextLine();
        for (int i = 1; i <= n; ++i){
            Topic topic = new Topic(i, sc2.nextLine());
            topics.put(topic.getId(), topic);
        }
        while(sc3.hasNext()){
            Group group = new Group(students.get(sc3.next()), topics.get(sc3.nextInt()));
            groups.add(group);
        }
        Collections.sort(groups);
        for (Group group : groups){
            System.out.println(group);
        }
    }
}
