package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = 1;
        int stars = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                space += 2;
                stars--;
            } else {
                space-=2;
                stars ++;
            }
            System.out.println();
        }
    }
}