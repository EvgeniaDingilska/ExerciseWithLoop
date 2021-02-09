package com.company.loop;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int num = sca.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= num-i; k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
