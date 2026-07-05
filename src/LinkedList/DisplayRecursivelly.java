package LinkedList;

import java.util.Scanner;

public class DisplayRecursivelly {
    public static void DisplayRecur(Node  head){
        if( head == null) return;
        DisplayRecur(head.next);
        System.out.print(head.value+" ");
//        DisplayRecur(head.next);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(100);
        Node b = new Node(2200);
        Node c = new Node(30);
        Node d = new Node(400);
        Node e = new Node(500);
        Node f = new Node(640);
        // connect karenge (Link karenge)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(get(a,2));
//        DisplayRecur(a);
    }
    private  static int get(Node head, int index){
        Node temp = head;
        for(int i  = 1;i<=index;i++){
            temp = temp.next;
        }
        return temp.value;
    }
}
