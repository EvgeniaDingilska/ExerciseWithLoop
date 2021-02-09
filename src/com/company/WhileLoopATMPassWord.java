package com.company;

import java.util.Scanner;

public class WhileLoopATMPassWord {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int passMemory = 0;

        while (passMemory!=6558){
            System.out.println("Please write your password:");
            passMemory = keyboard.nextInt();
            if (passMemory==6558)
                System.out.println("Correct password!");
            else
                System.out.println("Incorrect password try again\n");

        }
    }
}
