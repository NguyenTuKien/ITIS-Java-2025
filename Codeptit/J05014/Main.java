package J05014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        List<Teacher> teachers = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            cin.nextLine();
            teachers.add(new Teacher(i, cin.nextLine(), cin.nextLine(), cin.nextDouble(), cin.nextDouble()));
        }
        Collections.sort(teachers);
        for (Teacher teacher : teachers){
            System.out.println(teacher);
        }
    }
}
