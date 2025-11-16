package BinarySearchTree;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import Basic.Interview_Practice.removeDuplicate;
import Questions.n_m_total_paths;

public class BinarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        }

        if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // case 1 - leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 - only on child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 - two childs
            Node inOrderSuccessor = findIndorderSuccessor(root.right);
            root.data = inOrderSuccessor.data;
            root.right = delete(root.right, inOrderSuccessor.data);
        }

        return root;
    }

    private static Node findIndorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node search(Node root, int key) {

        if (root == null) {
            return null;
        }
        if (root.data == key) {
            return root;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }

    public static void printAllPath(Node root, List<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            System.out.println(path);
        }
        printAllPath(root.left,path);
        printAllPath(root.right, path);
        path.remove(path.size() -1 );
    }

    public static void main(String[] args) {

    //     5
    //     / \
    //    1   7
    //     \
    //      3
    //     / \
    //    2   4
    
        int[] values = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

      inOrderTraversal(root);

        System.out.println();
        List<Integer> path = new ArrayList<>(); 
        printAllPath(root, path);
    }

}
