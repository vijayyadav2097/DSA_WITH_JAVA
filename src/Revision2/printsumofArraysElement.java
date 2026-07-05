package Revision2;

import java.util.Scanner;

public class printsumofArraysElement {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your Arrays size :");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter your arrays elements : ");
        for(int  i = 0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int  i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum+" ");
    }
}
