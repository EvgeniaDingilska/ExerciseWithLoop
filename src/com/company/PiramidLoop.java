package com.company;

import java.util.Scanner;

public class PiramidLoop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num-i; j >= 1; j--) {
                System.out.print(" ");
            }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }

