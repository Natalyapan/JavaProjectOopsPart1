package org.example.Tasks;

import java.util.ArrayList;
import java.util.HashSet;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add("Adam");
        word.add("Adam");
        word.add("Asghar");
        word.add("Kate");
        word.add("Kate");
        HashSet<String> set=new HashSet<>(word);
        ArrayList<String> rWord=new ArrayList<>(set);
        System.out.println("All words: "+word);
        System.out.println("Words after removing duplicates: "+rWord);

    }
}
