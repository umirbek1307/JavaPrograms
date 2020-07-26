package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

                Scanner scn= new Scanner(System.in);
                int lo= scn.nextInt();
                int hi= scn.nextInt();
                for(int i = lo; i<=hi; i++){
                    boolean isprime= true;
                    for(int div=2; div*div<=i; div++){
                        if(i%div==0) {
                            isprime= false;
                            break;
                        }
                    }
                    if(isprime ==true){
                        System.out.println(i);
                    }
                }
            }
        }
