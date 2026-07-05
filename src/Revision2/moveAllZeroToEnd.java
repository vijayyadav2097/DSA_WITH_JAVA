package Revision2;

public class moveAllZeroToEnd {
    public static void print(int[] arr) {
        int n = arr.length;
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        j++;
                    }
                   }
                for (int ele : arr){
                    System.out.print(ele + " ");
            }
        }
    public static void main(String args[]){
         int[] arr ={23,2,0,3,0,30,4,0,0,5,0,9,54,0,0};
        print(arr);
    }
}
