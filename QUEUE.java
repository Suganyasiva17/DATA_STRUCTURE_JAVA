package DSA;

class Queue {
    int front, rear;
    int capacity;
    int[] array;

    Queue(int cap)
    {
        capacity = cap;
        front = 1;
        rear = -1;
        array = new int[capacity];
    }

    // Queue is full when size becomes
    // equal to the capacity
    boolean isFull()
    {
        if(rear == capacity - 1) System.out.println("OverFlow, can't Enqueue");
        return (rear == capacity - 1);
    }

    // Queue is empty when size is 0
    boolean isEmpty()
    {
        if(front == -1) System.out.println("UnderFlow, can't Dequeue");
        return (front == -1);
    }

    // Method to add an item to the queue.
    // It changes rear and size
    void enqueue(int item)
    {
        if (isFull())
            return;
        if(front == -1)
            front = 0;

        rear++;
        array[rear] = item;
        System.out.println(item + " enqueued to Queue");
    }

    // Method to remove an item from queue.
    // It changes front and size
    int dequeue()
    {
        if (isEmpty())
            return Integer.MIN_VALUE;

        int item = array[front];
        front++;

        //resetting the queue when last item is Dequeued
        if(front > rear)
            front = rear = -1;


        System.out.println(item +" dequeued from the Queue");
        return item;
    }

    // Method to get front of queue
    int front()
    {
        if (isEmpty())
            return Integer.MIN_VALUE;

        return array[front];
    }

    // Method to get rear of queue
    int rear()
    {
        if (isEmpty())
            return Integer.MIN_VALUE;

        return array[rear];
    }
}

// Driver class
class Temp {
    public static void main(String[] args)
    {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.dequeue();
        queue.dequeue();

        System.out.println("Front: " + queue.front());
        System.out.println("Read: " + queue.rear());
    }
}
