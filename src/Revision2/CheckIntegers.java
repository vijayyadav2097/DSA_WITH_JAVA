package Revision2;
import java.util.Scanner;
public class CheckIntegers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int n = (int) num;
      if(num == 0){
          System.out.print("IS interges");
      }else {
          System.out.print("Not integers :");
      }
    }
}
