package J05019;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Map<String, Detail> addresss = new HashMap<>();
        for (int i = 1; i <= n; ++i){
            cin.nextLine();
            String address = cin.nextLine();
            if(!addresss.containsKey(address)){
                Detail detail = new Detail(i, address);
                addresss.put(address, detail);
            }
            addresss.get(address).update(cin.nextLine(), cin.nextLine(), cin.nextDouble());
        }
        List<Detail> details = new ArrayList<>(addresss.values());
        Collections.sort(details);
        for (Detail detail : details){
            System.out.println(detail);
        }

    }
}
