package Revision2;

public class oops {
    public  static class vijay{
        int age;
        String name;
        String gender;
        double rollnumber;
        void print(){
            System.out.print("age"+age+" "+"Name"+ name+" "+ "Rollnumber"+rollnumber+" "+"Gender"+ gender);
        }
    }
    public static void main(String args[]){
         vijay v1 = new vijay();
         v1.age = 34;
         v1.name = "sonalli bharti";
         v1.rollnumber = 232.45;
         v1.gender = "female";
          v1.print();


    }
}
