package Revision2;
import java.util.Scanner;
public class si {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your rate : ");
        int rate = sc.nextInt();
        System.out.println("Enter  your principle :");
        int principle  = sc.nextInt();
        System.out.println("Enter yout time :");
        int time = sc.nextInt();
        double   si = principle * rate * time/100;
        System.out.print( "your simple intereste is "+ si);
    }
}
