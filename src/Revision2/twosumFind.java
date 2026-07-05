package Revision2;
import java.util.Scanner;
public class twosumFind {
    public static boolean twosum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Arrays size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your arrays elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter your target elements :");
        int target = sc.nextInt();
        System.out.println(twosum(arr,target));
    }
    }
