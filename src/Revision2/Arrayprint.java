package Revision2;
import java.util.Scanner;
public class Arrayprint {
    public static void  main(String args[]){
        int[] arr = {23,45,65,34,564,3,54,34,65,34,654};
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");

        int  target= sc.nextInt();
        System.out.println(print(arr,target,0));

    }
    public static boolean print(int [] arr , int target, int index){
        if(index == arr.length) return false;
        if(arr[index] == target ) return true;
        return print(arr,target,index+1);
    }
}
