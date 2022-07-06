package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int headCounter = 0 ,tailCounter = 0;

        System.out.println("Enter number of times to flip coin:");
        int n = scanner.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("Flipping Coin...");

            if(Math.random() < 0.5){
                System.out.println("Coin shows tails.");
                headCounter++;
            }else {
                System.out.println("Coin shows heads.");
                tailCounter++;
            }

        }

        double headPercentage = ((double)headCounter)/((double)n)*100;
        double tailPercentage = ((double)tailCounter)/((double)n)*100;

        System.out.println("% of times the coins shows head :"+headPercentage);
        System.out.println("% of times the coins shows tails :"+tailPercentage);
    }
}
