package Revision2;
import java.util.Scanner;
public class rotatewihoutusingfuntion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your arrays size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your array elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter your d value :");
        int d = sc.nextInt();
        int i = 0;
        int j = d - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        i = d;
        j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        i = 0;
        j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[i] = temp;
            i++;
            j--;
        }
        for (int ele : arr) {
            System.out.println(ele + " ");
        }
    }
}
