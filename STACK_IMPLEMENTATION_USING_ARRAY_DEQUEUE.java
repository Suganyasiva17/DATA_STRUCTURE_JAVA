package Stack;
import java.util.*;

class Main {


    public static void main (String[] args) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        // Create Graph to explain hierarchy of collections

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        // Create Graph to explain hierarchy of collections

        System.out.println("Top: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());
        System.out.println("Size: " + stack.size());

//        for (Integer integer : stack) {
//            System.out.print(integer + " ");
//        }
//
//        System.out.println();
//        System.out.println(stack.contains(12));
//        System.out.println(stack.contains(5));


        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.isEmpty());

    }

}
