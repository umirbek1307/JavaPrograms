package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Scanner scn= new Scanner (System.in);
       int x=scn.nextInt();
       for(int i=1;i<=10;i++){
           int val= x*i;
           System.out.println(x + " * " + i + " = "+ val);
        }
    }
}
