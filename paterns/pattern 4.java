package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = n;
        int space = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            space++;
            star--;
            System.out.println("\t");
        }
    }
}

