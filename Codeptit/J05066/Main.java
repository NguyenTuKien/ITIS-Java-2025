package J05066;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cntGD = 1, cntTP = 3, cntPP = 3;
        ArrayList<Staff> staffs = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String code = sc.next();
            String name = sc.nextLine().trim();
            int id = Integer.parseInt(code.substring(4));
            String pos = code.substring(0, 2);
            String level = code.substring(2, 4);
            if(pos.equals("GD") && cntGD > 0 && id == 1) cntGD--;
            else if(pos.equals("TP") && cntTP > 0 && id <= 3) cntTP--;
            else if(pos.equals("PP") && cntPP > 0 && id <= 3) cntPP--;
            else pos = "NV";
            Staff staff = new Staff(pos, id, level, name);
            staffs.add(staff);
        }
        Collections.sort(staffs);
        int m = sc.nextInt();
        sc.nextLine();
        while(m-- > 0){
            String keyword = sc.nextLine();
            for (Staff staff : staffs){
                if (staff.getName().toLowerCase().contains(keyword.toLowerCase())){
                    System.out.println(staff);
                }
            }
            System.out.println();
        }
    }
}