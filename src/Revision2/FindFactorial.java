package Revision2;
import java.util.Scanner;
public class FindFactorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr your number when you want to find factorial :");
        int n  = sc.nextInt();
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact *= i;
        }
        System.out.print( fact+" ");
    }
}
