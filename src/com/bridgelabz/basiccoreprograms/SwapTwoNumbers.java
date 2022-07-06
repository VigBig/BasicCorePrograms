package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Swapping number 'A' with number 'B' :");

        System.out.println("Enter number A :");
        int a = sc.nextInt();

        System.out.println("Enter number B :");
        int b = sc.nextInt();

        System.out.println("A before swap:"+a);
        System.out.println("B before swap:"+b);
        System.out.println();

        int temp = a;
        b=a;
        b=temp;

        System.out.println("A after swap:"+a);
        System.out.println("B after swap:"+b);

    }

}
