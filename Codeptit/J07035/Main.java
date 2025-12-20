package J07035;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc1.next());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String id = sc1.next();
            sc1.nextLine(); // Bỏ qua khoảng trắng thừa sau next()
            String name = sc1.nextLine();
            String clss = sc1.next();
            String email = sc1.next();
            students.add(new Student(id, name, clss, email));
        }
        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        int m = Integer.parseInt(sc2.next());
        ArrayList<Subject> subjects = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            String id = sc2.next();
            sc2.nextLine();
            String name = sc2.nextLine();
            int credits = sc2.nextInt();
            subjects.add(new Subject(id, name, credits));
        }
        Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
        int k = sc3.nextInt();
        ArrayList<Score> scores = new ArrayList<>();
        while (k-- > 0) {
            String studentID = sc3.next();
            String subjectID = sc3.next();
            double value = sc3.nextDouble();
            Student foundStudent = null;
            for (Student s : students) {
                if (s.getId().equals(studentID)) {
                    foundStudent = s;
                    break;
                }
            }
            Subject foundSubject = null;
            for (Subject sub : subjects) {
                if (sub.getId().equals(subjectID)) {
                    foundSubject = sub;
                    break;
                }
            }
            if (foundStudent != null && foundSubject != null) {
                scores.add(new Score(foundStudent, foundSubject, value));
            }
        }
        Collections.sort(scores);
        int q = sc3.nextInt();
        while (q-- > 0) {
            String querySubjectID = sc3.next();
            String subjectName = "";
            for (Subject sub : subjects) {
                if (sub.getId().equals(querySubjectID)) {
                    subjectName = sub.getName();
                    break;
                }
            }
            System.out.println("BANG DIEM MON " + subjectName + ":");
            for (Score s : scores) {
                if (s.getSubject().getId().equals(querySubjectID)) {
                    System.out.println(s);
                }
            }
        }

        sc1.close();
        sc2.close();
        sc3.close();
    }
}