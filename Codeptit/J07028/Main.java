package J07028;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        int n = sc2.nextInt();
        Map<String, Lecture> lectures = new LinkedHashMap<>();
        for (int i = 0; i < n; ++i){
            Lecture lecture = new Lecture(sc2.next(), sc2.nextLine());
            lectures.put(lecture.getId(), lecture);
        }
        n = sc3.nextInt();
        sc3.nextLine();
        while (n-- > 0){
            Lecture lecture = lectures.get(sc3.next());
            sc3.next();
            lecture.addHour(sc3.nextDouble());
            sc3.nextLine();
        }
        for (Lecture lecture : lectures.values()){
            System.out.println(lecture);
        }
    }
}
