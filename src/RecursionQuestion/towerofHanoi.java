package RecursionQuestion;

public class towerofHanoi {
    public static void tower(int n , char a, char b,char c){
        if(n == 0) return;
        tower(n-1,a,c,b);
        tower(n-1,b,c,a);
    }
    public static void main(String args[]){
        
    }
}
