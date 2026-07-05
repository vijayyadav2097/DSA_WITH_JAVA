package Revision2;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraysList {
    public static void main(String args[]){
        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(23);
        arr.add(54);
        arr.add(542);
        arr.add(434);
        arr.add(54);
        arr.add(56);
        System.out.println(arr);
        System.out.println("reverser  arrays list :");
        Collections.reverse(arr);
        System.out.println(arr);

    }
}
