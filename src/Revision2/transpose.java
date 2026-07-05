package Revision2;

public class transpose {
    public static void main(String args[]) {
        int[][] arr = {{34, 56, 78, 89, 45, 67, 89, 90, 67, 89}};
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
   print(arr);
    }
        public static  void print(int[][] arr){
              for(int [] e : arr){
                  for(int ele : e){
                      System.out.print(ele+" ");
                  }
              }
        }
    }

