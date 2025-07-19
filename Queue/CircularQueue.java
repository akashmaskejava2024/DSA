package Queue;

public class CircularQueue {
    static int[] arr;
    static int front;
    static int rear;
    static int size;

    CircularQueue(int n) {
        arr = new int[n];
        front = -1;
        rear = -1;
        size = n;
    }

    // isEmpty
    public static boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public static boolean isFull() {
        return (rear + 1) % size == front;
    }

    // add
    public static void add(int data) {

        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        // ading first element
        if (front == -1) {
            front = 0;
        }
        rear += (rear + 1) % size;
        arr[rear] = data;
    }

    // remove
    public static int remove() {
        if (isEmpty()) {
            System.out.println("Queeu is Empty ");
            return -1;
        }
        int removedItem = arr[front];

        // removing the last element
        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % size;
        }
        return removedItem;
    }

    // peek
    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queeu is Empty");
            return -1;
        }
        return arr[front];
    }

}
