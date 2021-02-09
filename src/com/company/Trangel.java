package com.company;

import java.util.Scanner;

public class Trangel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();

        for (int i = 0; i <num; i++) {
            for (int j = num - i; j >= 1; j--) {
                System.out.print(" ");
            }
                for (int k = 0; k <=i; k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }

}

