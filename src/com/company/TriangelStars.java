package com.company;

import java.util.Scanner;

public class TriangelStars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please write the number of stars: ");
        int number = scan.nextInt();

        for (int i = 0; i<number; i++){
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
