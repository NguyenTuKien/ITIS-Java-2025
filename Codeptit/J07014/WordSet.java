package J07014;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> se;

    public WordSet(String s) throws IOException {
        Scanner sc = new Scanner(new FileInputStream(s));
        TreeSet<String> se = new TreeSet<>();
        while(sc.hasNext()) {
            se.add(sc.next().toLowerCase());
        }
        this.se = se;
    }

    public TreeSet<String> getSe() {
        return se;
    }

    public String union(WordSet o) {
        TreeSet<String> Union = new TreeSet<>(this.se);
        Union.addAll(o.se);
        StringBuilder sb = new StringBuilder();
        for(String word : Union) sb.append(word).append(" ");
        return sb.toString().trim();
    }

    public String intersection(WordSet o) {
        TreeSet<String> Inter = new TreeSet<>(this.se);
        Inter.retainAll(o.se);
        StringBuilder sb = new StringBuilder();
        for(String word : Inter) sb.append(word).append(" ");
        return sb.toString().trim();
    }
}