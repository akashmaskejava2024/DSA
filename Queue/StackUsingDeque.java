package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    public class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addFirst(data);
        }

        public int pop() {
            if (deque.isEmpty()) {
                System.out.println(" Stack is already Empty");
                return -1;
            }
            return deque.removeFirst();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }

        public int peek() {
            if (deque.isEmpty()) {
                System.out.println(" Stack is already Empty");
                return -1;
            }
            return deque.getFirst();
        }

    }

    public static void main(String[] args) {

    }
}
