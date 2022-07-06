package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double harmonicNumber = 0.0;

        System.out.println("Enter Nth term of Harmonic series (N must not be <=0):");
        int n = scanner.nextInt();

        if(n>0){

            for(int i=1; i<=n; i++){

               harmonicNumber = 1.0/(double)i + harmonicNumber;
            }

            System.out.println("harmonic number of "+n+"th series is: "+harmonicNumber);

        }else{
            System.out.println("ERROR! N must not be <=0!");
        }


    }
}
