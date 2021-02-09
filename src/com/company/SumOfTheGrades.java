package com.company;

import java.util.Scanner;

public class SumOfTheGrades {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much score you would lik to enter:");
        int times = keyboard.nextInt();
        int  sumScore= 0;

        for(int i = 1 ; i<=times; i++){
            System.out.println("Please write the score "+i);
            int grades = keyboard.nextInt();
            sumScore+=grades;
        }
        double average = (double) sumScore/2;
        System.out.println("The sum of score are: " +average);
    }

}
