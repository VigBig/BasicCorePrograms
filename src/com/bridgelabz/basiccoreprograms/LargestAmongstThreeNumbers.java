package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class LargestAmongstThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Largest numbers amongst numbers 'A' , 'B' and 'C' :");

        System.out.println("Enter number A :");
        int a = sc.nextInt();

        System.out.println("Enter number B :");
        int b = sc.nextInt();

        System.out.println("Enter number B :");
        int c = sc.nextInt();

        int max = a;

        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }

        System.out.println("Largest amongst "+a+", "+b+" and "+c+" is: "+max);
    }
}
