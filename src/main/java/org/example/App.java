package org.example;

import java.util.Arrays;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args ){

        // Prompt user for input
        Scanner scan1 = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scan1.next().toLowerCase();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scan2.nextLine().toLowerCase();


        // Create an instance of AnagramChecker
        AnagramChecker checker = new AnagramChecker();

        // Call the findAndPrintAnagrams method
        checker.findAndPrintAnagrams(word, sentence);
    }

}
