package Revision2;
public class mergeTwosortedArrays {
    public static void main(String args[]) {
        int[] a = {23, 45, 344, 566, 875, 778};
        int[] b = {2, 4, 6, 8, 90, 786, 3454};
        int[] c = new int[a.length + b.length];
        for (int ele : c)
            System.out.print(ele + " ");
        System.out.println();
        merge(c, a, b);
        for (int ele : c)
            System.out.print(ele + " ");
        }
    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
            while (i < a.length)
                c[k++] = a[i++];
            while (j < b.length)
                c[k++] = b[j++];
            }
        }
