package Revision2;
import java.util.Scanner;
public class whileLoops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your number :");
        int  n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.print(i+" ");
            i+=2;
        }

    }
}
