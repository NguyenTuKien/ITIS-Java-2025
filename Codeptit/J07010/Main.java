package J07010;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = sc.nextInt();
        for (int i = 1; i <= n; ++i) {
            sc.nextLine();
            Student student = new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            System.out.println(student);
        }
    }
}
