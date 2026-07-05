package Revision2;
public class printArray {
    public static void print(int[] arr, int index){
        int n = arr.length;
        if(index == n) return;
        print(arr,index+1);
        System.out.print(arr[index]+" ");
    }
    public static void main(String args[]){
        int[] arr = {23,67,45,56,87,45,76,56,87,45,7,4,576};
        print(arr,0);
    }
}
