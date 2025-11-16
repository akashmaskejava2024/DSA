package Binary_Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


public class BasicBT {
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

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public void preOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        public void inOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }

        public void postOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }

        public void levelOrderTraversal(Node root) {
            if (root == null)
                return;
            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {

                Node currNode = q.remove();
                if (currNode != null) {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                } else {
                    System.out.println();// go to new Line
                    if (q.isEmpty()) { // if all the elements have been traveresed
                        break;
                    } else { //
                        q.add(null);
                    }
                }
            }
        }

        public int height(Node root) {

            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);

            return 1 + Math.max(lh, rh);

        }

        public int countNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int lcount = countNodes(root.left);
            int rcount = countNodes(root.right);
            return lcount + rcount + 1;
        }

        public int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;
        }

        // With Aproach 1 with Time Comllexity--> O(n^2)
        // public int diameter(Node root){
        // if(root == null){
        // return 0;
        // }

        // int lh = height(root.left);
        // int rh = height(root.right);
        // int currDiameter = lh + rh + 1;

        // int leftDiameter = diameter(root.left);
        // int rightDiameter = diameter(root.right);
        // return Math.max( currDiameter , Math.max(leftDiameter, rightDiameter));
        // }

        // Diameter with @nd Approach using Info Class with TIme COmplexity --> O(n)
        public class Info {
            int diameter;
            int height;

            public Info(int diameter, int height) {
                this.diameter = diameter;
                this.height = height;
            }
        }

        public Info diameter(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }
            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);

            int selfDiameter = leftInfo.height + rightInfo.height + 1;

            int maxDiameter = Math.max(selfDiameter, Math.max(leftInfo.diameter, rightInfo.diameter));
            int maxHeight = 1 + Math.max(leftInfo.height, rightInfo.height);

            return new Info(maxDiameter, maxHeight);
        }

        public boolean isSubtree(Node root, Node subRoot) {
            // base case like for now it has came
            if (root == null) {
                return false;
            }
            // 1. check for the same node in teh tree with the subroot
            if (root.data == subRoot.data) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }
            // this will call all the left and right subtree checking to avoid this
            // boolean leftAns = isSubtree(root.left, subRoot);
            // boolean rightAns = isSubtree(root.right, subRoot);
            // return leftAns || rightAns;
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

        public boolean isIdentical(Node node, Node subRoot) {
            if (node == null && subRoot == null) {
                return true;
            } else if (node == null || subRoot == null || node.data != subRoot.data) {
                // either is true and other is false;
                return false;
            }
            // if left subtree of the subtree is not identical
            if (!isIdentical(node.left, subRoot.left)) {
                return false;
            }
            // if right subtree of the subtree is not identical
            if (!isIdentical(node.right, subRoot.right)) {
                return false;
            }
            return true;
        }

        class TopViewInfo {
            int hd;
            Node node;

            public TopViewInfo(int hd, Node node) {
                this.hd = hd;
                this.node = node;
            }
        }

        public void topView(Node root) {

            if (root == null)
                return;

            Queue<TopViewInfo> q = new LinkedList<>();
            Map<Integer, Node> map = new HashMap<>();

            int min = 0, max = 0;
            q.add(new TopViewInfo(0, root));
            q.add(null);

            while (!q.isEmpty()) {

                TopViewInfo curr = q.remove();
                if (curr == null) {

                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(new TopViewInfo(max, root));
                    }
                } else {

                    if (!map.containsKey(curr.hd)) {
                        map.put(curr.hd, curr.node);
                    }

                    if (curr.node.left != null) {
                        q.add(new TopViewInfo(curr.hd - 1, curr.node.left));
                        min = Math.min(min, curr.hd - 1);
                    }

                    if (curr.node.right != null) {
                        q.add(new TopViewInfo(curr.hd + 1, curr.node.right));
                        max = Math.max(max, curr.hd + 1);
                    }
                }
            }
            for (int i = min; i < max; i++) {
                System.out.print(map.get(i).data + " ");
            }
            System.out.println();
        }

        public void kthLevel(Node root, int level, int key) {
            if (root == null) {
                return;
            }

            if (level == key) {
                System.out.print(root.data + " ");
                return;
            }

            kthLevel(root.left, level + 1, key);
            kthLevel(root.right, level + 1, key);
        }

        public Node lowestCommonAncestor(Node root, int n1, int n2) {

            List<Node> path1 = new ArrayList<>();
            List<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            int i = 0;
            for (; i < path1.size() && i < path2.size(); i++) {
                if (path1.get(i) != path2.get(i)) {
                    break;
                }
            }

            Node lca = path1.get(i - 1);
            return lca;

        }

        private boolean getPath(Node root, int n, List<Node> path) {

            if (root == null) {
                return false;
            }

            path.add(root);

            if (root.data == n) {
                return true;
            }

            boolean foundLeft = getPath(root.left, n, path);
            boolean foundRight = getPath(root.right, n, path);

            if (foundLeft || foundRight) {
                return true;
            }

            path.remove(path.size() - 1);
            return false;

        }

        public Node lowestCommonAncesotr2(Node root, int n1, int n2) {
            // if(root == null){
            // return null;
            // }
            if (root == null || root.data == n1 || root.data == n2) {
                return root;
            }

            Node leftLca = lowestCommonAncesotr2(root.left, n1, n2);
            Node rightLca = lowestCommonAncesotr2(root.right, n1, n2);

            if (leftLca == null) {
                return rightLca;
            }

            if (rightLca == null) {
                return leftLca;
            }

            return root;
        }

        public int minDistance(Node root, int n1, int n2) {

            Node lca = lowestCommonAncesotr2(root, n1, n2);

            int leftDistance = lcaDistance(lca, n1);
            int rightDistance = lcaDistance(lca, n2);

            return leftDistance + rightDistance;

        }

        private int lcaDistance(Node root, int n) {

            if (root == null) {
                return -1;
            }

            if (root.data == n) {
                return 0;
            }

            int leftDistance = lcaDistance(root.left, n);
            int rightDistance = lcaDistance(root.right, n);

            if (leftDistance == -1 && rightDistance == -1) {
                return -1;

            } else if (leftDistance == -1) {
                return rightDistance + 1;
            } else {
                return leftDistance + 1;
            }

        }

        public int kthAncestor(Node root, int n, int k) {
            if (root == null) {
                return -1;
            }

            if (root.data == n) {
                return 0;
            }
            int leftDistance = kthAncestor(root.left, n, k);
            int rightDistance = kthAncestor(root.right, n, k);

            if (leftDistance == -1 && rightDistance == -1) {
                return -1;
            }
            //simple way to have valid distance as other will have -1
            int max = Math.max(leftDistance, rightDistance);

            if (max + 1 == k) {
                System.out.println(root.data);
            } 

            return max + 1;

        }

        public int transformToSumTree(Node root){

            if(root == null){
                return 0; 
            }

            int originalData = root.data;

            int leftSum = transformToSumTree(root.left);
            int rightSum = transformToSumTree(root.right);

            root.data = leftSum + rightSum; 

            return root.data + originalData;
        }

        
    }

    public static void main(String[] args) {

        // 1
        // / \
        // / \
        // 2 3
        // / \ \
        // / \ \
        // 4 5 6

        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);
        // System.out.println(tree.sumOfNodes(root));

        // Tree structure for root:
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);
        int n1 = 4;
        int n2 = 6;

        tree.kthAncestor(root, 5, 2);

        // Tree structure for subRoot:
        /*
         * 2
         * / \
         * 4 5
         */

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);

        // System.out.println(tree.isSubtree(root, subRoot));
    }
}
