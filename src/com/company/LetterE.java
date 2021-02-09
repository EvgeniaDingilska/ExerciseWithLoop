package com.company;

import java.util.Scanner;

public class LetterE {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please write the size of Letter:");
        int num = keyboard.nextInt();
        int k = 1;
        for (int i = 1; i<=num; i++){
            if (num%2==0)
                k=0;
            if (i == 1 || i==num/2+k || i==num)
                for (int j = num/2+k; j<= num; j++){
                    System.out.print("*");
                }
            System.out.println("*");
        }

    }
}
