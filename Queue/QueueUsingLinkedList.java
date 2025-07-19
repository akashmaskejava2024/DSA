package Queue;

public class QueueUsingLinkedList {
    public class Queue {

        Node rear;
        int size;
        Node front;

        public class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // check isEmpty
        public boolean isEmpty() {
            return rear == null && front == null;
        }

        // add
        public void add(int data) {
            Node node = new Node(data);
            if (isEmpty()) {
                front = rear = node;
            } else {
                rear.next = node;
                rear = node;
            }
            size++;
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Already Empty");
                return -1;
            }
            // if only one lement is there
            int removedData;
            if (front == rear) {
                removedData = front.data;
                front = rear = null;
            } else {
                removedData = front.data;
                front = front.next;

            }
            size--;
            return removedData;

        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty ");
                return -1;
            }
            return front.data;
        }

        public int size() {
            return size;
        }

    }
}
