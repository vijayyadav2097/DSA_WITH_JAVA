package Revision2;
import java.util.Scanner;
public class Area {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your radius :");
        int radius = sc . nextInt();
     double area =  4.0/3*3.14 * radius * radius*radius;
        System.out.print("The area of circle is :"+ area );
    }
}
