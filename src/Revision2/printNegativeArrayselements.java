package Revision2;
import java.util.Scanner;
public class printNegativeArrayselements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your arrays size: ");
        int n = sc.nextInt();
        int vijay[] = new int[n];
        System.out.println("Enter your arrays elements :");
        for (int i = 0; i < vijay.length; i++) {
            vijay[i] = sc.nextInt();
        }
         for(int  i = 0;i<vijay.length;i++){
             if(vijay[i]<0){
                 System.out.print(vijay[i]+" ");
             }
         }
    }
}
