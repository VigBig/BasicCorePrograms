package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class Factors {

    public static void isPrimeFactor(int i) {
        int counter = 0;

        for (int j = 1; j <= i; j++) {

            if (i % j == 0) {
                counter++;
            }

        }

        if (counter == 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number:");
        int num = sc.nextInt();

        System.out.println("Prime factors of " + num + " are :");
        for (int i = 1; i * i <= num; i++) {

            if (num % i == 0) {
                isPrimeFactor(i);
            }

            if ( (i+1) * (i+1) > num) {
                isPrimeFactor(num);
            }

        }
    }
}