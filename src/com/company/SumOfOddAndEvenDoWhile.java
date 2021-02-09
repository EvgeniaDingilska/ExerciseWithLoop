package com.company;

import java.util.Scanner;

public class SumOfOddAndEvenDoWhile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num = 1;
        int evenSum = 0;
        int oddSum = 0;
        int count = 0;
        char letter;
        do {
            System.out.println("Please write the number");
            num = keyboard.nextInt();
            if (num % 2 == 0 && num != 0){
                evenSum += num;}
            else if (num % 2 != 0){
                oddSum += num;}
            else{
                count++;}

            System.out.println("Do you want to enter other number: y or n");
            keyboard.nextLine();
            letter = keyboard.next().charAt(0);

        } while (letter=='y');
        System.out.println("The sum of even:"+evenSum+" odd "+oddSum+" null "+count);
    }
}
