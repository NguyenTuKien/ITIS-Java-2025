package J05066;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int cntGD = 0, cntTP = 0, cntPP = 0;
        int n = sc.nextInt();
        List<Staff> staffs = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String code = sc.next();
            String name = sc.nextLine().trim();
//            String pos = code.substring(0, 2);
//            if (pos.equals("GD")) {
//                if (cntGD == 0) cntGD++;
//                else code = "NV" + code.substring(2);
//            }
//            else if (pos.equals("TP")) {
//                if (cntTP < 3) cntTP++;
//                else code = "NV" + code.substring(2);
//            }
//            else if (pos.equals("PP")) {
//                if (cntPP < 3) cntPP++;
//                else code = "NV" + code.substring(2);
//            }
            staffs.add(new Staff(code, name));
        }
        Collections.sort(staffs);
        int m = sc.nextInt();
        while(m-- > 0){
            String keyword = sc.next();
            for (Staff staff : staffs){
                if (staff.getName().toLowerCase().contains(keyword.toLowerCase())){
                    System.out.println(staff);
                }
            }
            System.out.println();
        }
    }
}
