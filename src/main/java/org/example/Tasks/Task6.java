package org.example.Tasks;

public class Task6 {

    public static int countVowels(String word) {
        word = "documentation";
        int vowelsCount = 0;
        for (char c : word.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }


    public static void main(String[] args) {
        String word="documentation";
        int vowels=countVowels(word);
        System.out.println("Nums of vowels in  "+word+" is: "+vowels);

    }
}
