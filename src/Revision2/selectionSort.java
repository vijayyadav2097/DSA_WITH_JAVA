package Revision2;
public class selectionSort {
    public static void print(int [] arr){
        int n = arr.length;
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
         int[] arr = {23,56,34,67,56,87,45,87,56,89};
         int n = arr.length;
         print(arr);
         for(int i = 0;i<n-1;i++){
             int min = Integer.MIN_VALUE;
             int mindex = -1;
             for(int j = i;j<n;j++){
                 if(arr[j] > min){
                     min = arr[j];
                     mindex = j;
                 }
             }
             int temp = arr[i];
             arr[i]= arr[mindex];
             arr[mindex] = temp;
         }
         print(arr);
    }
}
