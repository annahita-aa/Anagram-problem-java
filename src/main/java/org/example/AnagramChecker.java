package org.example;

import java.util.Arrays;

public class AnagramChecker {

    // Method to find and print anagrams
    public void findAndPrintAnagrams(String word, String sentence) {
        String[] words = sentence.split(" ");
        int count = 0;

        // Iterate through each word in the sentence
        for (String candidate : words) {
            // Check if the candidate word is an anagram of the input word
            if (isAnagram(word, candidate)) {
                System.out.println(String.format("%s and %s are anagrams", word, candidate));
                count++;
            }
        }
// Print the total number of anagrams found
        if (count == 0) {
            System.out.println("No anagrams found.");
        } else {
            System.out.println(String.format("%d anagram(s) found", count));
        }
    }

    // Method to check if two words are anagrams
    public boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        // Convert words to character arrays and sort them
        char[] sortedWord1 = word1.toCharArray();
        char[] sortedWord2 = word2.toCharArray();
        Arrays.sort(sortedWord1);
        Arrays.sort(sortedWord2);

        // Compare sorted arrays
        return Arrays.equals(sortedWord1, sortedWord2);
    }

}
