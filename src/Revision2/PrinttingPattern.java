package Revision2;
import java.util.Scanner;
public class PrinttingPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<1+i-1;j++){
                System.out.print((char)(65)+" ");
            }
            System.out.println();
        }
    }
}
