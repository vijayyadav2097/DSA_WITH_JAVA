package Revision2;
public class Insertionsort {
    public static void main(String args[]){
        int[] arr = {4,5,8,4,76,3,76,34,75,67,89,45,78,34,87};
        for(int  ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int i = 0;i<arr.length;i++){
            int j = i;
            while(  j>0 && arr[j]< arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println("insertion sort  is :");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}

