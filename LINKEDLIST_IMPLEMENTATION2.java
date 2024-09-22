package LinkedLists;

import java.lang.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class LinkedList {
    Node head; // head of list just creating object and not giving any instance makes head null
    //Node head = null;  // can also do this

    // Can also declare the class Node here also if you like

    public Node insertStart(int data) {
        Node newNode = new Node(data);

        newNode.next = head;

        //changing the new head to this freshly entered node
        head = newNode;

        return head;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        //need this if there is no node present in linked list at all
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;

    }

    public void insertPosition(int pos, int data) {
        int size = calcSize(head);

        //If pos is 0 then should use insertStart method
        //If pos is less than 0 then can't enter at all
        //If pos is greater than size then bufferbound issue
        if (pos < 1 || size < pos) {
            System.out.println("Can't insert," + pos + " is not a valid position\n");

        } else {
            Node newNode = new Node(data);
            //giving any random value
            Node temp = head;

            while (--pos > 0) {
                temp = temp.next;
            }
            //(25)->next = 10 as 12->next is 10
            newNode.next = temp.next;
            // (12)->next = 25
            temp.next = newNode;
            //new node added in b/w 12 and 10
        }
    }

    public void display() {
        //as linked list will end when Node is Null
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public int calcSize(Node node) {
        int size = 0;

        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        ll.insertStart(12);
        ll.insertStart(16);
        ll.insertStart(20);

        ll.insertLast(10);
        ll.insertLast(14);
        ll.insertLast(18);
        ll.insertLast(11);

        //Inserts after 3rd position
        ll.insertPosition(3, 25);

        ll.display();

    }
}
