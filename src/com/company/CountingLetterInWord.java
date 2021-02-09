package com.company;

import java.util.Scanner;

public class CountingLetterInWord {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        char letter = keyboard.next().charAt(0);
        int letterCoun = 0;


        for (int i = 0; i<word.length(); i ++){
            if (word.charAt(i)==letter)
                letterCoun++;
        }
        System.out.println("The letter that you choose is "+letter+" and the count : "+letterCoun);
    }
}
