package Revision2;
import java.util.ArrayList;
import java.util.Arrays;
public class commonElements {
    public static void commonelements(int[] a,int[] b){
        ArrayList <Integer> ans = new ArrayList <> ();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0,j = 0;
        while(i<a.length && j<b.length){
            if(a[i] == b[j])
                ans.add(a[i]);
            else if (a[i]> b[j]) i++;
                    else j--;
        }
    }
    public static void main(String args[]){
        int[] a = {2,34,5,3,1,3,6,3};
        int[] b = {2,5,6,2,5,34,67,45,7,3};

    }
}
