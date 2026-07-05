package Revision2;
import java.util.Scanner;
public class takeinputArrays {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your Arrays size :");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter your arrays elements : ");
         for(int  i = 0;i<arr.length;i++) {
             arr[i] = sc.nextInt();
         }
             for(int ele :arr){
                 System.out.print(ele+" ");
             }
         }
    }
