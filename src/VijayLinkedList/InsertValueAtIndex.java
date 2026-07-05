package VijayLinkedList;
   class Node {
       int value;
       Node next;
       int size;
       Node(int value) {
           this.value = value;
       }
   }
           class Linkedlist {
              Node tail;
              Node head;
               public void AddNode(int  value) {
                   Node  temp  = new Node(value);
                   if( head == null) head = tail = temp;
                   else{
                       tail.next = temp;
                       tail = temp;
                   }

               }

                void display() {
                   Node  temp = head;
                    while( temp != temp){
                        System.out.println(temp.value+" ");
                        temp = temp.next;
                    }
                    System.out.println();
               }
           }

public class InsertValueAtIndex {
     public static void main(String args[]){
         Linkedlist ll = new Linkedlist();
         ll.AddNode(12);
         ll.AddNode(12);
         ll.AddNode(12);
         ll.AddNode(12);
         ll.AddNode(120);
         ll.display();


     }
}
