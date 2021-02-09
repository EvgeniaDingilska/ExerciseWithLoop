package com.company;

public class ReverseWithSubstringAndLoop {
    public static void main(String[] args) {
                     //1234567 length
        String word = "Evgeniq";
                     //0123456 index
        int len = word.length()-1; //6

        for(int i = 0; i<word.length();i++){
            System.out.print(word.substring(len-i,len+1-i));
            //System.out.print(word.charAt(len-i));//len = 6 - i = 0 =6
        }                                           //len = 6 - i = 1 =5
    }                                               //len = 6 - i = 2 =4
}                                                   //len = 6 - i = 3 =3
                                                    //len = 6 - i = 4 =2....