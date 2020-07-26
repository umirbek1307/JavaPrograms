package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int i, hcf = 0;
        for(i = 1; i <= a || i <= b; i++) {
            if( a%i == 0 && b%i == 0 )
                hcf = i;
        }
        System.out.println(hcf);

        int max, step, lcm = 0;
        if(a > b){
            max = step = a;
        } else{
            max = step = b;
        }
        while(a!= 0) {
            if(max%a == 0 && max%b == 0) {
                lcm = max;
                break;
            }
            max += step;
        }
        System.out.println(lcm);

    }

}
