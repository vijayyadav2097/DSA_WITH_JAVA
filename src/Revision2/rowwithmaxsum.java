package Revision2;

public class rowwithmaxsum {
    public static void main(String args[]){
        int[][] arr = {{34,6675,34},{34,76,45},{65,87,435}};
        int row  = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j  =  0;j<arr[0].length;j++) {
                sum += arr[i][j];
            }
                if (sum > max) {
                    max = sum;
                    row = i;
                }
            }
                System.out.println(row+ " "+ max);
            }
        }

