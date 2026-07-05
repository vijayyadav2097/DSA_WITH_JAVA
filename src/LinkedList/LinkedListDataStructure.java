package LinkedList;

class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
    }
}
class Linkedlist{
    Node head;
    Node tail;
    int size;
    void addAtHead(int value) {
        Node temp = new Node(value);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAttail(int value) {
        Node temp = new Node(value);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void delete(){
        if(head == null){
            System.out.println("Empty  node");
            return;
        }
        head = head.next;
        if( head == null) {
            tail = null;
        }
        size--;
    }
    void Display(){
        if(head == null) return;
        Node  temp = head;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();

    }
    void insert(int index, int value) {
        if( index<0 || index>size) System.out.println("Invailed Index");
        else if( index == 0) addAtHead(value);
        else if ( index == size) addAttail(value);
        else{
            Node temp = head;
            for( int i = 1;i<=index-1;i++){
                temp = temp.next;
            }
            Node t = new Node(value);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
}
public class LinkedListDataStructure {
    public  static void main(String args[]){
        Linkedlist ll =  new Linkedlist();
         ll.addAttail(120);
        ll.addAttail(20);
        ll.addAttail(40);
        ll.addAttail(50);
//        ll.addAttail(1232);
//        ll.addAttail(1243);
         ll.Display();
        ll.addAtHead(100);
        ll.addAtHead(1000);
      ll.Display();
        ll.delete();
        ll.Display();
        System.out.println(ll.size);
        ll. insert(2,452);
        ll. insert(3,452);
        ll.Display();
    }
}
