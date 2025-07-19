package Queue;

import java.util.Stack;

public class QueueUsingTwoStacksUsingpopOofN {
    public static class Queue {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int size;

        public void add(int data) {
            s1.push(data);
            size++;
        }

        public int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            
            size--;

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int data = s2.pop();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return data;
        }

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }

    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }

    }

}
