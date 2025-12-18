
import java.io.*;
import java.util.TreeMap;

public class J07005 {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream(new File("DATA.IN"));
        DataInputStream dis = new DataInputStream(input);
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for(int i = 0; i < 100000; ++i){
            int n = dis.readInt();
            mp.putIfAbsent(n, 0);
            mp.put(n, mp.get(n) + 1);
        }
        for(int x : mp.keySet()) System.out.println(x + " " + mp.get(x));
        input.close();
        dis.close();
    }

}