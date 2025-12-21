package J05071;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Map<String, Area> areas = new HashMap<>();
        for (int i = 0; i < n; ++i){
            cin.nextLine();
            Area area = new Area(cin.nextLine(), cin.nextLine(), cin.nextInt());
            areas.put(area.getId(), area);
        }
        n = cin.nextInt();
        while(n-- > 0){
            String phone = cin.next();
            String start = cin.next();
            String end = cin.next();
            if(phone.startsWith("0")){
                Call call = new Call(phone, start, end, areas.get(phone.substring(1, 3)));
                System.out.println(call);
            } else {
                Call call = new Call(phone, start, end);
                System.out.println(call);
            }
        }
    }
}
