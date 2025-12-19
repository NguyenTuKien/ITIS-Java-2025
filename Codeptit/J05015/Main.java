package J05015;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner cin = new Scanner(System.in);
        List<Coureur> coureurs = new ArrayList<>();
        int n = cin.nextInt();
        cin.nextLine();
        for (int i = 0; i < n; i++) {
            Coureur coureur = new Coureur(cin.nextLine(), cin.nextLine(), cin.nextLine());
            coureurs.add(coureur);
        }
        Collections.sort(coureurs);
        for  (Coureur coureur : coureurs) {
            System.out.println(coureur);
        }
    }
}
