package Revision2;
import java.util.Scanner;
public class print {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number:");
        int n = sc.nextInt();
        print(0,n);
    }
    public static void print(int x, int n){
        if(x>n) return;
        System.out.print(x+" ");
        print(x+1,n);
    }
}
