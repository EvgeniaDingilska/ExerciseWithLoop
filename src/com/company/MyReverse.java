package com.company;

import java.util.Scanner;

public class MyReverse {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        int len = word.length()-1;
        //first way
//        for (int i = 0; i <word.length(); i ++){
//            //System.out.print(word.charAt(i));
//            System.out.print(word.charAt(len-i));

        // second way
        for (int i =word.length()-1;i>= 0; i--){
            System.out.print(word.charAt(i));
        }
    }


}
