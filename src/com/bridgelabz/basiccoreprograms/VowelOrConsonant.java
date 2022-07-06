package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter alphabet:");
        char c = sc.next().charAt(0);

        // char : ascii value
        //    a : 97
        //    z : 122
        //    A : 65
        //    Z : 90


        if( ( (int)c >=65 && (int)c <=90 ) || ( (int)c >=97 && (int)c <=122 ) ){

            switch (c){

                case 'a':
                case 'A':

                case 'e':
                case 'E':

                case 'i':
                case 'I':

                case 'o':
                case 'O':

                case 'u':
                case 'U':
                    System.out.println(c+" is a vowel.");
                    break;
                default:
                    System.out.println(c+" is a consonant.");

                }

            }else{
            System.out.println("ERROR! character must be an alphabet! Exiting program...");

        }
    }
}
