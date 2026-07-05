package LinkedList;
import  java.util.Scanner;
public class DisplayLinkedList {
    public static void Display(Node head) {
//        System.out.print(head.value+" ");
//        System.out.print(head.next.value+" ");
//        System.out.print(head.next.next.value+" ");
//        System.out.print(head.next.next.next.value+" ");
//        System.out.print(head.next.next.next.next.value+" ");
//        System.out.print(head.next.next.next.next.value+" ");
//        System.out.print(head.next.next.next.next. next.value+" ");
        // while loop
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.value + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
    // for loops
    for(
    Node temp = head;
    temp !=null;temp  =temp.next ){
        System.out.print(temp.value + " ");
    }
    System.out.println();
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node a = new Node(sc.nextInt());
        Node b = new Node(2200);
        Node c = new Node(30);
        Node d = new Node(400);
        Node e = new Node(500);
        Node f = new Node(640);
        // connect karenge (Link karenge)
        a.next = b; b.next = c;
        c.next = d;d.next = e;
        e.next = f;
        Display(a);
    }
}
