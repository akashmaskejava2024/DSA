package LinkedList.Basic;


public class DoublyLinkedList {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {

            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public int removeFirst() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        if (head == tail) {
            int data = head.data;
            head = tail = null;
            size--;
            return data;
        } else {
            int data = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return data;
        }
    }

    public void reverse(){
        Node currNode = head;
        Node prevNode = null;
        if(head == null){
            return; 
        }
        Node nextNode = null; 
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            currNode.prev = nextNode;
            prevNode = currNode; 
            currNode = nextNode;
        }
        head = prevNode;

    }


    public int removeLast() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        if (head == tail) {
            int data = head.data; 
            head = tail = null;
            size--;
            return data;
        } else {
            int data = tail.data;
            tail = tail.prev;
            tail.next = null;
            size--;
            return data;
        }

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();

        ll.addFirst(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.print();

    }
}
