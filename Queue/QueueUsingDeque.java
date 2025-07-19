package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    public class Queue {

        Deque<Integer> deque = new LinkedList<>();

        public boolean isEmpty() {
            return deque.isEmpty();
        }

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove(){
            if(isEmpty()){
                System.out.println(" Queue is Empty");
                return -1;
            }
            return deque.removeFirst();
        }

        public int peek(){
            if(isEmpty()){
                System.out.println(" Queue is Empty");
                return -1;
            }
            return deque.getFirst();
        }

    }

}
