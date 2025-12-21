import java.io.*;
import java.util.*;

public class J07015 {
    public static boolean is_prime(int num){
        if(num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        BufferedInputStream bf = new BufferedInputStream(new FileInputStream("SONGUYEN.in"));
        ObjectInputStream cin = new ObjectInputStream(bf);
        Map<Integer, Integer> freq = new TreeMap<>();
        List<Integer> list = (ArrayList<Integer>) cin.readObject();
        for  (Integer i : list) {
            if(is_prime(i)) freq.put(i, freq.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}