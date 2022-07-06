package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dividing number 'A' by number 'B' :");
        System.out.println("Enter number A :");
        int a = sc.nextInt();

        System.out.println("Enter number B :");
        int b = sc.nextInt();

        int quotient = a/b;
        int remainder = a%b;

        System.out.println("Quotient is :"+quotient);
        System.out.println("Remainder is:"+remainder);

    }
}
