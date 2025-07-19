package Stack;


public class StackUsingLinkedList {
    static class Stack {
        class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head;

        // isEmpty
        public boolean isEmpty() {
            if (head == null) {
                return true;
            } else {
                return false;
            }
        }

        // push
        public void push(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }
        // pop

        public int pop() {
            if (head == null) {
                return -1;
            }
            int data = head.data;
            head = head.next;
            return data;
        }

        // peek
        public int peek() {
            if (head == null) {
                return -1;
            }
            return head.data;
        }

        public void pushAtBottom(int data) {
            // base case
            if (isEmpty()) {
                push(data);
                return;
            }
            int top = pop();
            pushAtBottom(data);
            push(top);
        }


        public void reverse(Node head ){
            if(isEmpty()){
                return;
            }
            int top = pop();
            reverse(head.next);
            pushAtBottom(top);
        }

    }

}
