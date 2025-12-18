package J04022;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> wordSet = new TreeSet<>();

    public WordSet() {
    }

    public WordSet(String line) {
        String[] words = line.toLowerCase().trim().split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                wordSet.add(word);
            }
        }
    }

    public void setWordSet(TreeSet<String> wordSet) {
        this.wordSet = wordSet;
    }

    public WordSet union(WordSet other) {
        WordSet result = new WordSet();
        TreeSet<String> newSet = new TreeSet<>(this.wordSet);
        newSet.addAll(other.wordSet);
        result.setWordSet(newSet);
        return result;
    }

    public WordSet intersection(WordSet other) {
        WordSet result = new WordSet();
        TreeSet<String> newSet = new TreeSet<>();
        for(String s : this.wordSet) {
            if(other.wordSet.contains(s)) {
                newSet.add(s);
            }
        }
        result.setWordSet(newSet);
        return result;
    }

    @Override
    public String toString() {
        return String.join(" ", wordSet);
    }
}