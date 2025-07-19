package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
    public static class Stack {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // O(1)
        public void push(int data) {
            q1.add(data);
        }

        // O(n)
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            while (q1.size() > 1) {
                q2.add(q1.remove());
            }
            int removedData = q1.remove();
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            return removedData;
        }
        // O(n)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            while (q1.size() > 1) {
                q2.add(q1.remove());
            }
            int top = q1.remove();
            q2.add(top);
            // Swap queues
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            return top;
        }

    }
}
