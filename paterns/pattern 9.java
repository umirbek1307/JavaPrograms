package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if(i==j){
                    System.out.print("*\t");
                }
                else if (i+j==n+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}
