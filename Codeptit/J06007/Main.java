package J06007;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) sc.nextLine();
        n = sc.nextInt();
        sc.nextLine();
        Map<String, Lecture> lectures = new LinkedHashMap<>();
        for (int i = 0; i < n; ++i){
            Lecture lecture = new Lecture(sc.next(), sc.nextLine());
            lectures.put(lecture.getId(), lecture);
        }
        n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0){
            Lecture lecture = lectures.get(sc.next());
            sc.next();
            lecture.addHour(sc.nextDouble());
            sc.nextLine();
        }
        for (Lecture lecture : lectures.values()){
            System.out.println(lecture);
        }
    }
}
