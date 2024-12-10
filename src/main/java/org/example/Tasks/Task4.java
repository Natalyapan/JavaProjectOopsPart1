package org.example.Tasks;

public class Task4 {
    public static void main(String[] args) {
        String word="Mom";
        StringBuilder sb=new StringBuilder(word);
        sb.reverse();
        System.out.println("Word: "+word);
        System.out.println("Reverse word: "+sb);
    }
}
