package Revision2;

public class checkSortedAndrotated {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }

    public static void main(String args[]) {
        int[] arr = {23, 34, 56, 67, 2, 4, 6};
        checkSortedAndrotated obj = new checkSortedAndrotated();

        System.out.println(obj.check(arr));
    }
}

