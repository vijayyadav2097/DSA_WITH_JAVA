package Revision2;
public class forEachLoops {
    public static void main(String args[]) {
        int[][] arr = {{34, 65, 87, 34}, {67, 98, 67, 87}, {98, 45, 23, 56}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int ele : arr[i]) {
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}