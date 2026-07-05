package Revision2;

public class rotateArrays {
    public static void main(String args[]){
        int[] arr = {34,65,34,65,34,65};
         int  n = arr.length;
         int d = 3;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
         for(int ele: arr){
             System.out.println(ele+" ");

         }
    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
