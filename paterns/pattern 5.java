package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = 1;
        int spaces = n / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                stars += 2;
                spaces--;
            } else {
                spaces++;
                stars -= 2;
            }
            System.out.println();
        }
    }
}