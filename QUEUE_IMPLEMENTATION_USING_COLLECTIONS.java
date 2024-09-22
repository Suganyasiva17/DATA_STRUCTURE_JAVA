package DSA;

import java.util.ArrayDeque;
import java.util.LinkedList;

class Queue {
    public static void main (String[] args) {
        // Queue queue = new LinkedList<Integer>();
        LinkedList<Integer> queue = new LinkedList<>();
        // Queue<Integer> queue = new ArrayDeque<Integer>();
        //ArrayDeque<Integer> queue = new ArrayDeque<Integer>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        System.out.println(queue.contains(20));
        System.out.println(queue.contains(40));
        System.out.println(queue.peek());

//        for (Integer integer : queue) {
//            System.out.print(integer + " ");
//        }

        System.out.println();

//        while (!queue.isEmpty()){
//            System.out.print(queue.peek() + " ");
//            queue.poll();
//        }

        while (!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }

    }

}



import java.util.ArrayDeque;
import java.util.LinkedList;

class Queue {
    public static void main (String[] args) {
        // Queue queue = new LinkedList<Integer>();
        LinkedList<Integer> queue = new LinkedList<>();
        // Queue<Integer> queue = new ArrayDeque<Integer>();
        //ArrayDeque<Integer> queue = new ArrayDeque<Integer>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.element());

        System.out.println(queue.contains(20));
        System.out.println(queue.contains(40));
        System.out.println(queue.element());

        for (Integer integer : queue) {
            System.out.print(integer + " ");
        }

        System.out.println();

//        while (!queue.isEmpty()){
//            System.out.print(queue.element() + " ");
//            queue.poll();
//        }

        while (!queue.isEmpty()){
            System.out.print(queue.remove() + " ");
        }
        System.out.println();

        // The below will not throw exception but, will just return null
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());

        // The below will throw exception
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.element());

    }

}

