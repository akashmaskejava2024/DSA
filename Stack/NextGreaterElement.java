package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        int[] nextGreater = findNextGreater(arr);
        for(int i = 0; i<nextGreater.length ; i++){
            System.out.print(nextGreater[i] + " ");
        }
    }

    public static int[] findNextGreater(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[arr.length];
        int count = nextGreater.length -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                if (arr[s.peek()] <= arr[i]) {
                    s.pop();
                }
            }
            if (s.isEmpty()) {
                nextGreater[count--] = -1;
            } else {
                nextGreater[count--] = arr[s.peek()];
            }
            s.push(i);
        }
        return nextGreater;
    }
}
