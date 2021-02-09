package com.company;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String real = keyboard.nextLine();//"remaird"; //keyboard.nextLine();
        //String rev = "";

        for(int i = real.length()-1; i>=0 ; i--){
            //rev = rev +real.charAt(i);
            System.out.print(real.substring(i,i+1));
        }
        //System.out.println("The original numbuer is "+real+" the inverse one is "+rev);
    }
}
