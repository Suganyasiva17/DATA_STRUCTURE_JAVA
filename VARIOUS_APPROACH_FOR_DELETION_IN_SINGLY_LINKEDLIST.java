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
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        newNode.next = head;

        //changing the new head to this freshly entered node
        head = newNode;

        return head;
    }

    static void display(Node node) {
        //as linked list will end when Node is Null
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    static Node deletenode(Node head, int delVal) {
        Node temp = head;
        Node previous = null;

        //Case when there is only 1 node in the list
        if (temp.next == null) {
            head = null;
            System.out.println("Value, deleted" + delVal);
            return head;
        }
        //if the head node itself needs to be deleted
        if (temp != null && temp.data == delVal) {
            //Case 1 head becomes 30
            head = temp.next; //changing head to next in the list

            System.out.println("Value, deleted " + delVal);
            //case 1: 22 deleted and freed by relying on garbage collector
            return head;
        }

        //run until we find the value to be deleted in the list
        while (temp != null && temp.data != delVal) {
            //store previous link node as we need to change its next val
            previous = temp;
            temp = temp.next;
        }

        //if value is not present then
        //temp will have traversed to last node NULL
        if (temp == null) {
            System.out.println("Value not found");
            return head;
        }

        // Case 2: (24)->next = 16 (as 20->next = 16)
        // Case 3: (16)->next = NULL (as 12->next = NULL)
        previous.next = temp.next;

        //case 2: 20 deleted and freed
        //case 3: 12 deleted and freed
        System.out.println("Value %d, deleted " + delVal);
        return head;
    }

    public static void main(String args[]) {
        Node head = null;

        head = insert(head, 12);
        head = insert(head, 16);
        head = insert(head, 20);
        head = insert(head, 24);
        head = insert(head, 30);
        head = insert(head, 22);

        System.out.println("Linked List Before Operations : ");
        display(head);

        //deleting first occurrence of a value in linked list
        head = deletenode(head, 22);
        head = deletenode(head, 20);
        head = deletenode(head, 12);

        System.out.println("Linked List After Operations : ");

        display(head);

    }
}


import java.lang.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
/// deletion at k postion
class LinkedList {
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        newNode.next = head;

        //changing the new head to this freshly entered node
        head = newNode;

        return head;
    }

    static void display(Node node) {
        //as linked list will end when Node is Null
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    static Node deletenode(Node head, int pos) {

        Node temp = head;
        Node previous = null;

        //if the head node itself needs to be deleted
        int size = calcSize(head);

        if (pos < 1 || pos > size) {
            System.out.println("Enter valid position");

            return head;
        }
        if (pos == 1) {
            //Case 1 head becomes 30
            head = temp.next; //changing head to next in the list
            System.out.println("Value deleted: " + temp.data);

            return head;
        }

        //run until we find the value to be deleted in the list
        while (--pos > 0) {
            //store previous link node as we need to change its next val
            previous = temp;
            temp = temp.next;
        }

        // Case 2: (24)->next = 16 (as 20->next = 16)
        // Case 3: (16)->next = NULL (as 12->next = NULL)
        previous.next = temp.next;
        System.out.println("Value deleted: " + temp.data);

        return head;
    }

    static int calcSize(Node node) {
        int size = 0;

        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    public static void main(String args[]) {
        Node head = null;

        head = insert(head, 12);
        head = insert(head, 16);
        head = insert(head, 20);
        head = insert(head, 24);
        head = insert(head, 30);
        head = insert(head, 22);

        System.out.println("Linked List Before Operations : ");
        display(head);

        //deleting first occurrence of a value in linked list
        head = deletenode(head, 1);
        display(head);

        head = deletenode(head, 3);
        display(head);

        head = deletenode(head, 4);
        display(head);

        head = deletenode(head, -1);
        head = deletenode(head, 10);
        display(head);

    }
}
