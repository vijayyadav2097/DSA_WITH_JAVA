package Revision2;
import java.util.Scanner;
public class TerneryOperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your number :");
        int  n = sc.nextInt();
        System.out.print( (n%2==0 ? "even":"odd"));
    }
}
