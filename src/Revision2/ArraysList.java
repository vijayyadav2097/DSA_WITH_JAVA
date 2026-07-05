package Revision2;
import java.util.ArrayList;
public class ArraysList {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(45);
        arr.add(65);
        arr.add(12);
        arr.add(244);
        int n = arr.size();
        for(int i = 0;i<n;i++){
        System.out.print(arr.get(i)+" ");
       }
    }
}
