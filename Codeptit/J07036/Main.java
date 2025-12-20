package J07036;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Map<String, Student> students = new HashMap<>();
        Map<String, Subject> subjects = new HashMap<>();
        Map<String, List<Score>>  scores = new HashMap<>();
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
        int n = sc1.nextInt();
        sc1.nextLine();
        for (int i = 0; i < n; i++){
            Student student = new Student(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            students.put(student.getId(), student);
        }
        n = sc2.nextInt();
        for (int i = 0; i < n; i++){
            sc2.nextLine();
            Subject subject = new Subject(sc2.nextLine(), sc2.nextLine(), sc2.nextInt());
            subjects.put(subject.getId(), subject);
        }
        n = sc3.nextInt();
        for (int i = 0; i < n; i++){
            Score score = new Score(students.get(sc3.next()), subjects.get(sc3.next()), sc3.nextDouble());
            String id = score.getId();
            if (!scores.containsKey(id)){
                scores.put(id, new ArrayList<>());
            }
            scores.get(id).add(score);
        }
        n  = sc3.nextInt();
        sc3.nextLine();
        while (n-- > 0){
            String id = sc3.nextLine();
            try {
                List<Score> scores1 = scores.get(id);
                Collections.sort(scores1);
                System.out.println("BANG DIEM lop " + id + ":");
                for (Score s : scores1) {
                    System.out.println(s);
                }
            } catch (Exception ignored) {}
        }
    }
}
