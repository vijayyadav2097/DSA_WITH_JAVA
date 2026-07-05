package Revision2;
public class checkArrayIsSorted {
    public static   void  main(String args[]) {
        int[] arr = {1,3,4,67,467};
        System.out.println(check(arr));

    }
    public static boolean check(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                return false;
            }
        }
        return false;
    }
}
