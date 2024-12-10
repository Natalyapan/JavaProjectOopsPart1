package org.example.Tasks;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add("Adam");
        word.add("John");
        word.add("Asghar");
        word.add("Emmie");
        word.add("Kate");

        for (String x : word) {
            if (x.startsWith("A")) {
                System.out.println(x.toLowerCase());
            }
        }

    }
}
