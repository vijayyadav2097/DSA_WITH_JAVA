package RevisionLinkedList;
   class node {
       int value;
       node next;
        int size;

       node(int value) {
           this.value = value;
       }
   }
             class Linkedlist{
                node head;
                node tail;
                int size;

                 public void addNodeAtTail(int value) {
                     node temp = new node(value);
                     if( head == null) head = tail = temp;
                     tail.next = temp;
                     tail = temp;
                     size++;
                 }
                 void AddNodeAthead(int value){
                     node temp = new node(value);
                     if( head == null) head = tail = temp;
                    temp.next = head;
                       head = temp;
                       size++;
                 }
                 void display(){
                     node temp = head;
                     if(temp == null) return;
                     while( temp != null){
                         System.out.print(temp.value+" ");
                         temp = temp.next;
                     }
                     System.out.println();
                 }

                 public void DeleteAtHead() {
                     if (head == null) {
                         System.out.println("Empty node");
                         return;
                     }
                     head = head.next;
                     if (head == null) {
                         tail = null;
                     }
                     size --;
                 }
          void inseetValueAtIndex(int index , int value) {
              if (index < 0 && index > size){
                  System.out.println("Invailed index");
                  return;
              }
              if( index == 0) AddNodeAthead(value);
               if( index == size) addNodeAtTail(value);
               else  {
                    node temp  = head;
                    for( int  i = 1; i<index-1;i++){
                         temp =  temp.next;
                    }
                    node t =  new node(value);
                    t.next =  temp.next;
                    temp.next = t;
               }
               size ++;

              }
             }

public class CreateAndPrintLimkedList {
    public static void main(String args[]){
      //  Linkedlist a = new linkedlist(23);
//        node a = new node(23);
//        node b = new node(232);
//        node c = new node(23);
//        node d = new node(23);
//        node e = new node(23);
//        node f = new node(23);
//          a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;
//         e.next = f;
//        System.out.println(a.next.value+" ");
        Linkedlist ll = new Linkedlist();
         ll.addNodeAtTail(314);
        ll.addNodeAtTail(344);
        ll.addNodeAtTail(345);
        ll.addNodeAtTail(334);
        ll.display();
        ll.AddNodeAthead(100);
        ll.AddNodeAthead( 200);
        ll.display();
        ll.DeleteAtHead();
        ll.display();
       ll.inseetValueAtIndex(3 ,45);
       ll.display();
        System.out.println(ll.size+" ");

    }

}
