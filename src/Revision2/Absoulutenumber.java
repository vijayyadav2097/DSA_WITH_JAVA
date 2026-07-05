package Revision2;
import java.util.Scanner;
public class Absoulutenumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();
        if(n<0){
            n = -n;
            System.out.print("The absolute number is : " +n +" ");
        }
    }
}
