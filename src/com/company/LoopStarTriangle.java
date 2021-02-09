package com.company;

public class LoopStarTriangle {
    public static void main(String[] args) {
        int i = 1, j=5;

        for(;i<5 && j++ >i; i++){
            System.out.print("*");
        }System.out.println();
    }
}
