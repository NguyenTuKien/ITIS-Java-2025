package J05062;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        List<Student> orgStudents = new ArrayList<>();
        List<Student> rankStudents = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            cin.nextLine();
            Student student = new Student(cin.nextLine(), cin.nextDouble(), cin.nextInt());
            orgStudents.add(student);
            rankStudents.add(student);
        }
        Collections.sort(rankStudents);
        int cnt = 0;
        double gpa = 0.0;
        for (Student student : rankStudents) {
            if (!student.getType().equals("KHONG")) {
                if (cnt >= m && Double.compare(student.getGpa(), gpa) != 0) {
                    student.setType("KHONG");
                } else {
                    cnt++;
                    gpa = student.getGpa();
                }
            }
        }
        for (Student student : orgStudents){
            System.out.println(student);
        }
    }
}
