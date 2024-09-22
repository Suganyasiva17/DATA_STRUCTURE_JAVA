package Stack;

//java.lang.Object
//        java.util.AbstractCollection<E>
//        java.util.AbstractList<E>
//        java.util.Vector<E>
//        java.util.Stack<E>

//The Stack class represents a last-in-first-out (LIFO) stack of objects.
// It extends class Vector with five operations that allow a vector to be treated as a stack.
// The usual push and pop operations are provided, as well as a method to peek at the top item on the stack,
// a method to test for whether the stack is empty, and a method to search the stack for an item and discover how far it is from the top.

// All Implemented Interfaces:
// Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess

// Create Graph to explain hierarchy of collections

import java.util.*;

class Main {


    public static void main (String[] args) {

        Stack<Integer> stack = new Stack<>();
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
        // returns the position from the top of the stack where the object is located with base case being 1
        // the return value -1 indicates that the object is not on the stack.
        System.out.println(stack.search(15));
        System.out.println(stack.search(10));
        System.out.println(stack.search(5));
        System.out.println(stack.search(20));

        while (stack.size() > 0)
        {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }

    }

}
