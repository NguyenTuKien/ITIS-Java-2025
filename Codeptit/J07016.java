import java.io.*;
import java.util.*;

public class J07016 {
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
        BufferedInputStream bf1 = new BufferedInputStream(new FileInputStream("DATA1.in"));
        BufferedInputStream bf2 = new BufferedInputStream(new FileInputStream("DATA2.in"));
        ObjectInputStream cin1 = new ObjectInputStream(bf1);
        ObjectInputStream cin2 = new ObjectInputStream(bf2);
        Map<Integer, Integer> freq1 = new TreeMap<>();
        Map<Integer, Integer> freq2 = new TreeMap<>();
        List<Integer> list1 = (ArrayList<Integer>) cin1.readObject();
        for  (Integer i : list1) {
            if(is_prime(i)) freq1.put(i, freq1.getOrDefault(i,0)+1);
        }
        List<Integer> list2 = (ArrayList<Integer>) cin2.readObject();
        for  (Integer i : list2) {
            if(is_prime(i) && freq1.containsKey(i)) freq2.put(i, freq2.getOrDefault(i,0)+1);
        }
        for (Integer i : freq2.keySet()){
            System.out.println(i + " " + freq1.get(i) + " " + freq2.get(i));
        }
    }
}