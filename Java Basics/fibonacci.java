package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
                Scanner scn = new Scanner(System.in);
                int n=scn.nextInt();
                int a=0;
                int b=1;
                for (int i=1; i<=n; i++){
                    System.out.println(a);
                    int c= a+b;
                    a=b;
                    b=c;
                }

            }
        }
