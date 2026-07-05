package Revision2;
import java.util.Scanner;
public class SquareRoot {
    public static int  check( int k ){
         int low  = 0, high = k;
        while(low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == k) {
                return mid;
            } else if (mid * mid > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
            return high;
        }
    public   static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int k = sc.nextInt();
        System.out.println(check(k));
    }
}
