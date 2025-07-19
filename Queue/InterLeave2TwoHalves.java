package Queue;

import java.util.LinkedList;
import java.util.Queue;


public class InterLeave2TwoHalves {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        System.out.println(interLeavedQueue(q));

    }

    public static Queue<Integer> interLeavedQueue(Queue<Integer> q) {
        Queue<Integer> temp = new LinkedList<>();
        int halfSize = q.size() / 2;

        // Step 1: Move first half to temp
        for (int i = 0; i < halfSize; i++) {
            temp.add(q.remove());
        }

        while (!temp.isEmpty()) {
            q.add(temp.remove());
            q.add(q.remove());
        }
        return q;

    }
}
