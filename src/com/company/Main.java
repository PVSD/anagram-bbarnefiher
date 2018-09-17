package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Anagram Test\nPlease enter your two phrases on different lines. (Is case sensitive)\nPhrase One:");
        String phraseOne = stringScanner.nextLine();
        System.out.println("Phrase Two:");
        String phraseTwo = stringScanner.nextLine();


        if (phraseOne.length() == phraseTwo.length()){

            String phraseOneArray[] = new String[phraseOne.length()];
            String phraseTwoArray[] = new String[phraseTwo.length()];

            for (int i = 0; i < phraseOne.length(); i++){
                //System.out.println(i);
                phraseOneArray[i] = phraseOne.substring(i, i + 1);
                phraseTwoArray[i] = phraseTwo.substring(i, i+1);
            }
            //System.out.println(Arrays.toString(phraseOneArray));
            //creates array of both strings with one character per index

            Arrays.sort(phraseOneArray);
            Arrays.sort(phraseTwoArray);
            //sorts the phrases

            //System.out.println(Arrays.toString(phraseOneArray));
            //System.out.println(Arrays.toString(phraseTwoArray));


            if (Arrays.equals(phraseOneArray, phraseTwoArray)) {
                System.out.println("Your two phrases are anagrams of each other!");
            }
            else {
                System.out.println("Your two phrases are not anagrams of each other");
            }
            //determines if the sorted phrases are equal to one another.



        }
        else {
            System.out.println("Your two phrases are not anagrams of each other.");
            System.exit(0);
        }







    }
}
