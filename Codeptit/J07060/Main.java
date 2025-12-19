package J07060;

import java.io.File;
import java.text.CollationElementIterator;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
//        Scanner sc = new Scanner(new File("J07060/MONTHI.in"));
        Scanner sc = new Scanner(new File("MONTHI.in"));
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Subject> subjects = new HashMap<>();
        for (int i = 1; i <= n; ++i){
            Subject subject = new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine());
            subjects.put(subject.getId(), subject);
        }
//        sc = new Scanner(new File("J07060/CATHI.in"));
        sc = new Scanner(new File("CATHI.in"));
        n = sc.nextInt();
        sc.nextLine();
        Map<String, Shift>  shifts = new HashMap<>();
        for (int i = 1; i <= n; ++i){
            Shift shift = new Shift(i, sc.nextLine(), sc.nextLine(), sc.nextLine());
            shifts.put(shift.getId(), shift);
        }
//        sc = new Scanner(new File("J07060/LICHTHI.in"));
        sc = new Scanner(new File("LICHTHI.in"));
        n = sc.nextInt();
        sc.nextLine();
        List<Schedule> schedules = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            Schedule schedule = new Schedule(shifts.get(sc.next()), subjects.get(sc.next()), sc.nextInt(), sc.nextInt());
            schedules.add(schedule);
        }
        Collections.sort(schedules);
        for (Schedule schedule : schedules){
            System.out.println(schedule);
        }
    }
}
