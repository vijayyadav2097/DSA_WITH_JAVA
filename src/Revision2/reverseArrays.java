package Revision2;
import java.util.Scanner;
public class reverseArrays {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your array size :");
       int n = sc.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter your arrays elements :");
       for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
       }
       for(int ele : arr) {
           System.out.print(ele + " ");
       }
       System.out.println();
       int i = 0, j = arr.length - 1;
       while (i < j) {
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
      for(int ele : arr){
          System.out.print(ele+" ");
      }
   }
}
