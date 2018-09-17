package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Anagram Test\nPlease enter your two phrases on different lines.\nPhrase One:");
        String phraseOne = stringScanner.nextLine();
        System.out.println("Phrase Two:");
        String phraseTwo = stringScanner.nextLine();


        if (phraseOne.length() == phraseTwo.length()){

            


            for (int i = 0; i < phraseOne.length(); i++){
                System.out.println(i);




            }

            //creates array of both strings with one character per index

        }
        else {
            System.out.println("Your two phrases are not anagrams of each other.");
            System.exit(0);
        }







    }
}
