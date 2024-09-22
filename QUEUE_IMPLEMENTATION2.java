

class Queue {
    int front, rear, size;
    int capacity;
    int[] array;

    Queue(int cap)
    {
        capacity = cap;
        front = size = 0;
        rear = capacity - 1;
        array = new int[capacity];
    }

    // Queue is full when size becomes
    // equal to the capacity
    boolean isFull()
    {
        return (size == capacity);
    }

    // Queue is empty when size is 0
    boolean isEmpty()
    {
        return (size == 0);
    }

    // Method to add an item to the queue.
    // It changes rear and size
    void enqueue(int item)
    {
        if (isFull())
            return;
        rear = (rear + 1) % capacity;
        array[rear] = item;
        size = size + 1;
        System.out.println(item + " enqueued to Queue");
    }

    // Method to remove an item from the queue.
    // It changes the front and size
    int dequeue()
    {
        if (isEmpty())
            return Integer.MIN_VALUE;

        int item = array[front];
        front = (front + 1) % capacity;
        size = size - 1;

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
        queue.enqueue(50);
        queue.enqueue(60);


        System.out.println("Front: " + queue.front());
        System.out.println("Read: " + queue.rear());
    }
}
