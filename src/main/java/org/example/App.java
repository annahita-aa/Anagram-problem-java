package org.example;

import java.util.Arrays;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        System.out.print("Print Your Word: ");
        Scanner scan1 = new Scanner(System.in);
        String word = scan1.next().toLowerCase();
        System.out.print("Print Your Sentence: ");
        Scanner scan2 = new Scanner(System.in);
        String sentence = scan2.nextLine().toLowerCase();



        String[] words = sentence.split(" ");
        int count = 0;


        for (String candidate : words) {
            if (candidate.length() == word.length()) {
                char[] sortedWord = word.toCharArray();
                char[] sortedCandidate = candidate.toCharArray();
                Arrays.sort(sortedWord);
                Arrays.sort(sortedCandidate);

                if (Arrays.equals(sortedWord, sortedCandidate)) {
                    System.out.println(String.format("%s and %s are anagrams", word, candidate));
                    count++;
                }
            }
        }

        if (count !=0){
            System.out.println(String.format("%d anagram(s) found", count));
        }
        System.out.println("No anagrams found.");


    }
}
