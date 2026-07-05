package Revision2;
import java.util.Scanner;
public class findSumdigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0) {
            sum *=10;
            sum += (n % 10);
            n /= 10;
        }
            System.out.print(sum+" ");
        }
    }

