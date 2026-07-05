package Revision2;
import java.util.Scanner;
public class power {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your base value:");
        int a  = sc.nextInt();
        System.out.println("Enter your exponents value :");
        int b = sc.nextInt();
        int ans = pow(a,b);
        System.out.println( a+"  " +"raised to the power " +b+"  "+ "is"+ " "+ans +"  ");
    }
    public static int pow(int a,int b){
        if(b==0) return 1;
        int call = pow(a,b/2);
          if ( b%2==0) return call* call;
          else  return a*  call* call;
    }
}
