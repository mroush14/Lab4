package edu.cscc;
import java.util.Arrays;

// Mitchell Roush, 2/5/2020, Determining the most and least expensive phone prices

public class Main {
    public static void main (String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int[] prices = new int[5];
        System.out.println("Enter all 5 smartphone prices: ");
        for (int i=0; i < prices.length; i++) {
            prices[i] = input.nextInt();
        }

        Arrays.sort(prices);

        System.out.println("The three most expensive phones:");

        for (int i = prices.length-1; i >= 2; i--) {
            System.out.println(prices[i]);
        }

        System.out.println("The three cheapest phones: ");

        for (int i = 0; i <= 2; i++) {
            System.out.println(prices[i]);
        }

    }
}