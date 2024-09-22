package Stack;

import java.io.*;
import java.util.*;

class Stack {

    ArrayList<Integer> list = new ArrayList<>();
    void push(int x) {
        list.add(x);
    }

    int pop() {
        int res = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return res;
    }

    int peek() {
        return list.get(list.size() - 1);
    }

    int size() {
        return list.size();
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

}

class Main {

    public static void main (String[] args)
    {
        Stack s = new Stack();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty() ? "Stack is Empty" : "Stack is not Empty");
    }
}
