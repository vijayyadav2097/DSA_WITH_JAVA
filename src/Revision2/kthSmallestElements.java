package Revision2;
import java.util.Arrays;
public class kthSmallestElements {
    public static void main(String args[]) {
        int[] arr = {34, 56, 34, 65, 23, 659, 7, 4, 75, 34};
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
            }
        System.out.println();
        int k = 9;
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
           }
        System.out.println(k + "th smallest element = " + arr[k - 1]);
    }
}