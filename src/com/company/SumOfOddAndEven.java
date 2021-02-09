package com.company;

import java.util.Scanner;

public class SumOfOddAndEven {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        int odd = 0;
        int even = 0;
        String positive = "yes";

        while (positive.equalsIgnoreCase("yes")){
            System.out.println("Write the number:");
            num = keyboard.nextInt();

            if (num%2==0)
                 odd+=num;
            else
                even+=num;
            System.out.println("Do you want to enter other number yes or no");
            keyboard.nextLine();
            positive = keyboard.nextLine();
        }
        System.out.println("The sum of odd are: "+odd+" and even are "+even);

    }
}
