package Revision2;
import java.util.Scanner;
public class searchInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size :");
        int  n =  sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter your array elements :");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter your target elements :");
        int target = sc.nextInt();
        boolean flag = false;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]== target) {
                flag = true;
                break;
            }
            }
            if(flag== true)
                System.out.println("Elements are exits in array :");
            else{
                System.out.println("Elements are not exist in arrays :");
            }
        }
    }

