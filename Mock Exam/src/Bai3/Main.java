package Bai3;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc1 = new Scanner(new File("BAITAP.in"));
        int n = sc1.nextInt();
        sc1.nextLine();
        HashMap<String, BaiTap> baiTap = new HashMap<>();
        for (int i = 0; i < n; i++){
            BaiTap bt = new BaiTap(sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            baiTap.put(bt.getStudentId(), bt);
        }
        Scanner sc2 = new Scanner(new File("BAOCAO.in"));
        ArrayList <BaoCao> baoCao = new ArrayList<>();
        for (int i = 0; i < n; ++i){
            BaoCao bc = new BaoCao(baiTap.get(sc2.nextLine()), sc2.nextLine());
            baoCao.add(bc);
        }
        Collections.sort(baoCao);
        for (BaoCao bc : baoCao) System.out.println(bc);
    }
}
