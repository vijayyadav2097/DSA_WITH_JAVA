package Revision2;
public class printtwoArrays {
    public static void main(String args[]) {
        int[][] arr = {{34, 465, 76, 87}, {56, 87, 45, 876}, {89, 56, 34, 87}};
         for(int j = 0; j<arr[0].length;j++){
             for(int i =0;i<arr.length;i++){
                 System.out.print(arr[i][j]+" ");
             }
             System.out.println();
         }
    }
}
