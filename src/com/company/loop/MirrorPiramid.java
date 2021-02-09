package com.company.loop;

import java.util.Scanner;

public class MirrorPiramid {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int row= keyboard.nextInt();
        for (int i = 1; i<=row; i++){
            for(int j = 0; j<i; j++){
                System.out.print("-");
            }for (int k =0; k<=row-i; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
