package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int div = 2; div<n; div++){
            while(n%div==0){
                System.out.print(div+" ");
                int q=n / div;
                n=q;

            }
        }

        if(n!=1){
            System.out.print(n);
        }
    }
}
