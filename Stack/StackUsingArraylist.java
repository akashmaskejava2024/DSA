package Stack;

import java.util.ArrayList;

public class StackUsingArraylist {

    static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();
        static int top = -1;

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            if (top == -1) {
                return;
            }
            list.add(data);
            top++;
        }

        public static int pop() {
            if (top == -1) {
                return -1;
            }
            int data = list.get(top);
            list.remove(list.get(top));
            top--;
            return data;
        }

        public static int peek() {
            if (top == -1) {
                return -1;
            }
            return list.get(top);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

    }

}
