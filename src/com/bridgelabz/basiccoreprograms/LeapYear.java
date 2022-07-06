package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Year:");
        int year = scanner.nextInt();

        if(year>=0){

            if ( ( (year % 4 == 0) && (year % 100!= 0) ) || (year %400 == 0) ){
                System.out.println(year+" is a leap year.");
            }else{
                System.out.println(year+" is not a leap year.");
            }

        }else{
            System.out.println("ERROR! Year must be a positive integer!");
        }


    }
}
