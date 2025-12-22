import java.io.*;
import java.util.*;

public class J07030 {
    public static boolean check(int n){
        if (n < 2) return false;
        for (int  i = 2; i * i <= n; ++i){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] argv) throws IOException, ClassNotFoundException {
        BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("DATA1.in"));
        BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("DATA2.in"));
        ObjectInputStream ois1 = new ObjectInputStream(bis1);
        ObjectInputStream ois2 = new ObjectInputStream(bis2);
        ArrayList <Integer> arr1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList <Integer> arr2 = (ArrayList<Integer>) ois2.readObject();
        Set<Integer> set1 = new TreeSet<>(arr1);
        Set<Integer> set2 = new TreeSet<>(arr2);
        for(int it : set1){
            if(it >= 1000000 - it) break;
            if(check(it) && check(1000000 - it) && set2.contains(1000000 - it)){
                System.out.println(it + " " + (1000000 - it));
            }
        }

    }
}
