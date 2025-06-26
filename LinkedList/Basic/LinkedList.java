package LinkedList.Basic;

public class LinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // methods
    public void addFirst(int data) {

        // step 1 : creating new Node
        Node newNode = new Node(data);

        // if my linkedList is already null as no any data added yet
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Link the head
        newNode.next = head;
        // change the new Node as head
        head = newNode;
    }

    public void addLast(int data) {
        // create New Node
        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        // add to the tail node pointing to the newNode
        tail.next = newNode;

        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty ");
            return;
        }
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "-->");
            tempNode = tempNode.next;
        }
    }

    public void add(int index, int data) {

        // base case if index = 0
        if (index == 0) {
            addFirst(data);
        }

        Node newNode = new Node(data);
        // intialize the breakpoint
        int count = 0;
        Node tempNode = head;

        while (count < index) {
            tempNode = tempNode.next;
            count++;
        }

        // make the newNode point to the nextnode and currNode point the NewNode
        newNode.next = tempNode.next;
        tempNode.next = newNode;
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        Node tempNode = head;
        while (tempNode != null) {
            count++;
            tempNode = tempNode.next;
        }
        return count;
    }

    public Integer removeFirst() {
        if (head == null) {
            System.out.println("Empty List");
            return null;
        }
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null; // update tail if list becomes empty
        }
        return data;
    }

    public Integer removeLast() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            head = null;
            return head.data;
        }

        Node prev = head.next;
        while (prev.next.next != null) {
            prev = prev.next;
        }
        int data = prev.next.data;
        prev.next = null;
        return data;
    }

    public int iterativeSearch(int key) {
        int count = 0;
        Node tempNode = head;
        while (tempNode.next != null) {
            if (tempNode.data == key)
                return count;
            tempNode = tempNode.next;
            count++;
        }
        return -1;
    }

    public int recusiveSearch(int key, LinkedList ll, Node node, int count) {
        if (node == null) {
            return -1;
        }
        if (node.data == key) {
            return count;
        }
        return recusiveSearch(key, ll, node.next, ++count);
    }

    public void reverse() {
        Node prevNode = null;
        Node currNode = tail = head;
        Node nextNode;

        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }

    public int removeNthFromEnd(int n) {
        int size = 0;
        Node tempNode = head;
        while ((tempNode != null)) {
            size++;
            tempNode = tempNode.next;
        }
        if (n == size) {
            int removedData = head.data;
            head = head.next;
            return removedData;
        }
        int nthPosition = size - n;
        int count = 1;
        tempNode = head;

        while (count < nthPosition) {
            tempNode = tempNode.next;
            count++;
        }
        // tempNode will point to the prevNode than the currNode
        int removedData = tempNode.next.data;
        tempNode.next = tempNode.next.next;
        return removedData;
    }

    // slow fast approach
    public Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // 1+
            fast = fast.next.next; // 2+
        }
        return slow;
    }

    public boolean isPalindrome() {
        // base case
        if (head == null || head.next == null) {
            return true;
        }

        // find Middle Node
        Node midNode = findMidNode(head);

        // reversal logic
        Node prevNode = null;
        Node currNode = midNode;
        Node nextNode;

        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        Node firstNode = head;
        // becuase the prevNode at last is going to be the reversed nodes head
        Node lastNode = prevNode;

        // check left halh and second half
        while (lastNode != null) {

            if (firstNode.data != lastNode.data) {
                return false;
            }
            firstNode = firstNode.next;
            lastNode = lastNode.next;
        }
        return true;
    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }

        return false;
    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;

        boolean isCycle = false;
        Node prevNode = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        if (!isCycle) {
            return;
        }
        slow = head;
        // fast already pointing to the node where they meet in the above loop

        // but if the slow = head and also = fast;
        // as it is connected on head
        if (slow == fast) {
            tail.next = null;
            return;
        }
        while (slow != fast) {
            slow = slow.next;
            prevNode = fast;
            fast = fast.next;
        }
        prevNode.next = null;
    }

    public Node findMidForMergeSort(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prevNidNode = slow;
        return prevNidNode;
    }

    public Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }
        // find Mid
        Node midNode = findMidForMergeSort(head);
        Node rightHead = midNode.next;
        midNode.next = null;
        // mergeSort fr left and rightHead
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft, newRight);
    }

    public Node merge(Node head1, Node head2) {

        Node mergedLL = new Node(-1); // to return the mergedLL.next at last
        Node temp = mergedLL; // for the future use of mergedLL

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                // incerase both temp and head1 to the next ndoe
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);

        head = ll.mergeSort(head);
        ll.print();

    }
}
