package Revision2;

public class bubbleSort_deceresingOrder {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = {23, 56, 34, 87, 56, 8, 546, 87, 45, 87, 45};
        int n = arr.length;
        print(arr);
        int swap = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                break;
            }
        }
            print(arr);
        }
    }

