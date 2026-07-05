package Revision2;
import java.util.Scanner;
public class checkTriangleOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  a : ");
        int a = sc.nextInt();
        System.out.println("Enter your b : ");
        int b = sc.nextInt();
        System.out.println("Enter your c : ");
        int c = sc.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.print("This is triangle :");
        }else{
            System.out.println("This is not triangle :");
        }
    }
}
