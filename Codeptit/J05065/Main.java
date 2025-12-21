package J05065;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        int n = sc.nextInt();
        int cntGD = 1, cntTP = 3, cntPP = 3;
        ArrayList<Staff> staffs = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String code = sc.next();
            String name = sc.nextLine().trim();
            int id = Integer.parseInt(code.substring(4));
            String pos = code.substring(0, 2);
            String level = code.substring(2, 4);
            if(pos.equals("GD") && cntGD > 0) cntGD--;
            else if(pos.equals("TP") && cntTP > 0) cntTP--;
            else if(pos.equals("PP") && cntPP > 0) cntPP--;
            else pos = "NV";
            Staff staff = new Staff(pos, id, level, name);
            staffs.add(staff);
        }
        Collections.sort(staffs);
        int m = sc.nextInt();
        while(m-- > 0){
            String keyword = sc.next();
            for (Staff staff : staffs){
                if(staff.getPos().equals(keyword)){
                    System.out.println(staff);
                }
            }
            System.out.println();
        }
    }
}