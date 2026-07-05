package Revision2;
import java.util.Scanner;
public class countNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();
        int count = 0;
            while (n != 0) {
                n /= 10;
                count++;
            }
            System.out.println(count + " ");
        }
    }

