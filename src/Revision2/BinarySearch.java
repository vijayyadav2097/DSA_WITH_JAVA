package Revision2;
public class BinarySearch {
    public static boolean check(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
       if (arr[mid] > target)
                high = mid - 1;
            else if (arr[mid] < target)
                low = mid + 1;
            if (arr[mid] == target)
                return true;
        }
        return false;
    }
    public static void main(String  args[]){
        int [] arr  = {23,65,34,76,34,8,5,98,45};
        int target = 8;
        System.out.println( check(arr,target));
    }
}
