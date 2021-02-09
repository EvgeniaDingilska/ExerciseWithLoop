package com.company;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int num = keyboard.nextInt();
        int rev = 0;
        int reminder = 0;
        int temp = num;
        while (temp>0) {
            reminder= temp%10;
            rev = rev*10+reminder;
            temp /=10;
        }
        System.out.println("Reverse of number:"+num+" is: "+ rev);
    }
}
