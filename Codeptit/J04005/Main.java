package J04005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String dob = sc.nextLine();
        float score1 = sc.nextFloat();
        float score2 = sc.nextFloat();
        float score3 = sc.nextFloat();
        Student a = new Student(name, dob, score1, score2, score3);
        System.out.println(a.toString());
    }
}

