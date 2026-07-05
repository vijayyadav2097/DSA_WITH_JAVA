package Revision2;

public class sumofTwoDArrays {
    public static void main(String args[]) {
        int[][] arr = {{45, 67, 987, 8}, {7, 87, 56, 98}, {67, 89, 456, 76}, {98, 87, 45, 87}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.print(sum + " ");
    }
}
