package com.company.loop;

import java.util.Scanner;

public class LetterALoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i =1; i<=num; i++){

            for(int j = 1; j<=num/2 ; j++){
                if( j==1 || i==1 || i==num/2 || j==num/2) {
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
        //One way for solving

//        for (int i = 0; i<=n; i++) {
//            // Inner for loop for logic execution
//            for (int j = 0; j<= n / 2; j++) {
//                // prints two column lines
//                if ((j == 0 || j == n / 2) && i != 0 ||
//                        // print first line of alphabet
//                        i == 0  && j != n / 2 ||
//                        // prints middle line
//                        i == n / 2)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
    }
}

