package Revision2;
import java.util.Arrays;
public class findSumPair {
    public static boolean findpair(int []  arr , int target){
        for(int ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        int n = arr.length;
        int  i = 0, j = n-1;
        while(i<j){
            if(arr[i] + arr[j] == target) return true;
            else if(arr[i]+ arr[j] > target) j--;
            else if(arr[i] + arr[j] < target) i++;
        }
        return false;
    }
    public static void main(String args[]){
        int [] arr = {23,56,43,87,4,6,3,876,10};
        int target  =10;
           boolean ans =  findpair(arr,target);
        System.out.print(ans+" ");
    }
}
