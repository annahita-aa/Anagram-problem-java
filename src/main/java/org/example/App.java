package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        System.out.print("Print Your Word: ");
        Scanner scan1 = new Scanner(System.in);
        String word = scan1.next();
        System.out.print("Print Your Sentence: ");
        Scanner scan2 = new Scanner(System.in);
        String sentence = scan2.nextLine();

        word = word.toLowerCase();
        sentence = sentence.toLowerCase();

        String[] words = sentence.split(" ");

        String result = "No Anagram Found";
        int count = 0;
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() == word.length()){

                char[] charWord = word.toCharArray();
                char[] charWords = words[i].toCharArray();

                Arrays.sort(charWord);
                Arrays.sort(charWords);

                if(Arrays.equals(charWord,charWords)){
                    System.out.println(String.format("%s and %s are Anagram",word,words[i]));
                    count++;
                }

            }


            }
        if (count !=0){
            result= String.format("%d Anagram found",count);
        }
        System.out.println(result);


    }
}
