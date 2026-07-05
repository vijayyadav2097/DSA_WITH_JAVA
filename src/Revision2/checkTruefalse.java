package Revision2;
import java.security.DrbgParameters;
import java.util.Scanner;
public class checkTruefalse {
    public static void main(String args[]){
        int [] arr  = {23,43,54,76,56,76,45,6,34,76,45,65,23,65};
        Scanner sc = new Scanner(System.in);
        int  target  =  sc.nextInt();
        exists(arr,target,0);
       boolean ans = exists(arr,target,0);
        System.out.println(ans);

    }
    public static boolean exists(int [] arr , int target, int index) {
        if (index == arr.length) return false;
        if (arr[index] == target) return true;
        return  exists(arr,target, index+1);
    }
}
