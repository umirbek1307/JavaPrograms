package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
                Scanner scn = new Scanner(System.in);

                    int n = scn.nextInt();
                    boolean isprime=true;
                    for(int div = 2; div*div <=n; div++)
                    {
                        if (n%div==0) {
                            isprime=false;
                            break;
                        }
                    }
                    if (isprime== true) {
                        System.out.println("prime");
                    }
                    else {
                        System.out.println("not prime");
                    }
                }

            }


