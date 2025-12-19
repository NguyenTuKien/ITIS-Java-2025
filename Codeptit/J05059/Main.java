package J05059;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> students = new ArrayList<Student>();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            students.add(student);
        }
        Collections.sort(students);
        int pass = sc.nextInt();
        double score = students.get(pass - 1).getTotal();
        System.out.println(String.format("%.1f", score));
        for(Student student : students){
            System.out.print(student + " ");
            if (student.getTotal() >= score){
                System.out.println("TRUNG TUYEN");
            }
            else {
                System.out.println("TRUOT");
            }
        }
    }
}
