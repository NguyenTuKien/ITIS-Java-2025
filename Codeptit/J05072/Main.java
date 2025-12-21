package J05072;

import java.util.*;

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
        List<Call> calls = new ArrayList<>();
        while(n-- > 0){
            String phone = cin.next();
            String start = cin.next();
            String end = cin.next();
            Call call;
            if(phone.startsWith("0")) call = new Call(phone, start, end, areas.get(phone.substring(1, 3)));
            else call = new Call(phone, start, end);
            calls.add(call);
        }
        Collections.sort(calls);
        for (Call call : calls){
            System.out.println(call);
        }
    }
}
