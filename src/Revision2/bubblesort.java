package Revision2;
public class bubblesort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int[] arr = {2, 4, 6, 3, 76, 34, 7, 34, 7, 8, 345, 7};
        int n = arr.length;
        print(arr);
        int swap = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap ++;
                }
            }
            if(swap == 0){
                break;
            }
        }
            print(arr);
        }
    }
