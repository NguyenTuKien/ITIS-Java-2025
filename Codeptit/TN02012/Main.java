package TN02012;


import java.util.*;

public class Main {
    static Scanner cin =  new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, String> depts = new HashMap<>();
        int t = cin.nextInt();
        while (t-- > 0) {
            String id = String.valueOf(cin.next());
            String name = String.valueOf(cin.nextLine()).trim();
            depts.put(id, name);
        }
        List <Staff> staffs = new ArrayList<>();
        t = cin.nextInt();
        cin.nextLine();
        while (t-- > 0) {
            String id = cin.nextLine();
            String dept = depts.get(id.substring(3, 5).toUpperCase());
            String name = cin.nextLine();
            int salary = cin.nextInt();
            int days = cin.nextInt();
            cin.nextLine();
            staffs.add(new Staff(id, name, dept, salary, days));
        }
//        Collections.sort(staffs);
        for (Staff staff : staffs) {
            System.out.println(staff);
        }
    }
}
