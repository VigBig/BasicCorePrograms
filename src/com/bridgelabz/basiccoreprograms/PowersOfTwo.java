package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Nth power of 2 (where 0<=N<31):");
        int n = scanner.nextInt();

        System.out.println("Table of powers of 2 from 0 to "+n+":");
        if( (0<=n) && (n<31) ){

            for(int i=0; i<=n; i++){

                System.out.println(i+"th Power of 2 = "+ ( (int)( Math.pow(2.0,i) ) ) );
            }


        }else{
            System.out.println("ERROR! Condition for N must satisfy the condition 0<=N<31 ");
        }


    }
}
