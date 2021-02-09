package com.company;

import java.util.Scanner;

public class DoWhileSum {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String ans;
        do {
            System.out.print("Please write the first number:");
            int num1 = keyboard.nextInt();

            System.out.print("Please write the second number:");
            int num2 = keyboard.nextInt();
            int sum = num2 + num1;
            System.out.println("The sum of is:" + sum);
            System.out.println("Do you want to calculate again: yes or no");
            keyboard.nextLine();
            ans = keyboard.nextLine();
        }while (ans.equalsIgnoreCase("yes"));
    }
}
