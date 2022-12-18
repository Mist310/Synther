package com.roy;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = input.nextInt();
        if (n%2==1) {
            System.out.println("odd number");
        }
        else{
            System.out.println("even number");
        }
    }
}
