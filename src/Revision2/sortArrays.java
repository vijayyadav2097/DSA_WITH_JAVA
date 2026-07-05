package Revision2;
import java.util.Scanner;
import java.util.Arrays;
public class sortArrays {
    public static void main(String args[]){
        int[] arr = {23,543,23,43,2,53,234,523,24};
        for(int ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
