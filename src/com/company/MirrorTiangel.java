package com.company;

import java.util.Scanner;

public class MirrorTiangel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i = 1; i<=num; i++){
            for (int j = i; j<=num; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
