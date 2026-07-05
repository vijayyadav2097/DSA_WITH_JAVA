package Revision2;
import java.util.Scanner;
public class SwaapTwonumber {
    public static void main(String  args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your first  number : ");
        int a  = sc.nextInt();
        System.out.println("Enter  your second number :");
        int b = sc.nextInt();
        System.out.println(a+" "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println( a +" "+ b);
    }
}
