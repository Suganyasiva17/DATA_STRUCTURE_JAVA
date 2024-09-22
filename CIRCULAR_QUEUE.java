class CircularQueue {
    int front, rear;
    int capacity;
    int curr_size;
    int[] a;

    CircularQueue(int cap)
    {
        capacity = cap;
        front = -1;
        rear = -1;
        curr_size = 0;
        a = new int[capacity];
    }

    boolean isFull()
    {
        return (front == rear + 1) ||
                (front == 0 && rear == capacity - 1);
    }

    boolean isEmpty()
    {
        return front == -1;
    }

    // Method to add an item to the queue.
    // It changes rear and size
    void enqueue(int item)
    {
        if (isFull())
            System.out.println("Can't add the queue is full ");

        else
        {
            if (front == -1)
                front = 0;

            rear = (rear + 1) % capacity;
            a[rear] = item;
            System.out.println(item + " was added");
        }
    }

    // Method to remove an item from queue.
    // It changes front and size
    int dequeue()
    {
        int item;
        if (isEmpty())
        {
            System.out.println("Can't add the queue is empty");
            return (Integer.MIN_VALUE);
        }
        else
        {
            item = a[front];
            if (front == rear)
            {
                front = rear = -1 ;
            }
            else
            {
                front = (front + 1) % capacity;
            }
            System.out.println(item +  " dequeued");
            return item;
        }
    }

    // Method to get front of queue
    int front()
    {
        if (isEmpty())
            return Integer.MIN_VALUE;

        return a[front];
    }

    // Method to get rear of queue
    int rear()
    {
        if (isEmpty())
            return Integer.MIN_VALUE;

        return a[rear];
    }

    void display()
    {
        int i;
        if (isEmpty())
            System.out.println("Empty Queue");
        else {

            System.out.println("\nQueue: ");
            for (i = front; i != rear; i = (i + 1) % capacity) {
                System.out.print(a[i]+ " ");
            }
            System.out.println(a[i]);

        }
    }
}

// Driver class
class Temp {
    public static void main(String[] args)
    {
        CircularQueue queue = new CircularQueue(6);

        queue.dequeue();//Underflow condition

        queue.enqueue(12);
        queue.enqueue(14);
        queue.enqueue(16);
        queue.enqueue(18);
        queue.enqueue(20);

        queue.display();
        queue.dequeue();
        queue.dequeue();

        queue.display();

        queue.enqueue(22);
        queue.enqueue(24);
        queue.enqueue(26);
        queue.enqueue(28);//Overflow condition
        queue.display();

    }
}
Code in Python:
from sys import maxsize


class Queue:
    def __init__(self, cap):
        self.queue = [None] * cap
        self.capacity = cap
        self.front = -1
        self.rear = -1
        self.curr_size = 0

    def is_full(self):
        return (self.front == self.rear + 1) or (self.front == 0 and self.rear == self.capacity - 1)

    def is_empty(self):
        return self.front == -1

    def enqueue(self, item):
        if self.is_full():
            print("Can't add the queue is full ")

        else:
            if self.front == -1:
                self.front = 0

            self.rear = (self.rear + 1) % self.capacity
            self.queue[self.rear] = item
            print(item, " was added")

    def dequeue(self):
        item = None
        if self.is_empty():
            print("Can't add the queue is empty");
            return -maxsize
        else:
            item = self.queue[self.front]

            if self.front == self.rear:
                self.front = self.rear = -1
            else:
                self.front = (self.front + 1) % self.capacity

            print(item, " dequeued")
            return item

    # function to display the queue
    def display(self):
        i = 0
        if self.is_empty():
            print("Empty Queue")
        else:
            print("\nQueue: ")
            i = self.front
            while i != self.rear:
                print(self.queue[i], end=" ")
                i = (i + 1) % self.capacity

            print(self.queue[i])


# Driver Code
q = Queue(6)
q.dequeue()  # Underflow condition

q.enqueue(12)
q.enqueue(14)
q.enqueue(16)
q.enqueue(18)
q.enqueue(20)

q.display()
q.dequeue()
q.dequeue()

q.display()

q.enqueue(22)
q.enqueue(24)
q.enqueue(26)
q.enqueue(28)  # Overflow condition
q.display()
