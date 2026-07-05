package LinkedListLevel2;
class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    // Add node at tail
    void addNodeAtTail(int value) {
        Node temp = new Node(value);

        if (head == null) {
            head = tail = temp;
            return;
        }

        tail.next = temp;
        tail = temp;
    }

    // Print Linked List
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}
public class CreateLinkedList{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addNodeAtTail(10);
        ll.addNodeAtTail(20);
        ll.addNodeAtTail(30);
        ll.addNodeAtTail(40);

        ll.display();
    }
}

