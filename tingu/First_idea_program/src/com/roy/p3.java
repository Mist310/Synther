package com.roy;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Principal amount:");
        int P = input.nextInt();
        System.out.println("Please enter the rate of interest:");
        int R = input.nextInt();
        System.out.println("Please enter the duration(Yrs):");
        int T = input.nextInt();
        int s = (P*T*R)/100;
        System.out.println("The Simple Interest is:"+ s);

    }
}
