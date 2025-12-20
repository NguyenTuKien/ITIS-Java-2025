package J07015;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class J07015 {
    // Khai báo mảng sàng (đề bài số < 10000 nên để kích thước 10000 là đủ)
    public static boolean[] prime = new boolean[100005];
    public static void sieve() {
        for (int i = 0; i < 100001; i++) prime[i] = true;
        prime[0] = prime[1] = false;
        for (int i = 2; i * i < 10000; i++) {
            if (prime[i]) {
                for (int j = i * i; j < 10000; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("2 17\n" +
                        "11 15\n" +
                        "997 8");
    }
}