package Basic.Interview_Practice;

public class Remove_Duplicate_WIthout_Hashset {
    public static void main(String[] args) {

        String str = "Banana";

        removeDuplicate(str);

        int[] arr = { 1, 2, 3, 3, 4, 5, 2, 1, 10 };
        removeDuplicate(arr);
    }

    private static void removeDuplicate(int[] arr) {

        boolean[] isSeen = new boolean[256];
        int[] newArr = new int[arr.length];

        int count = 0;
        for (int a : arr) {
            if (!isSeen[a]) {
                newArr[count++] = a;
                isSeen[a] = true;

            }
        }
        for(int i = 0; i<count; i++){
            System.out.print(newArr[i] + " ");
        }

    }

    private static void removeDuplicate(String str) {

        char[] arr = str.toCharArray();

        boolean[] isSeen = new boolean[256];
        String newStr = "";

        for (char c : arr) {
            if (!isSeen[c]) {
                newStr += c;
                isSeen[c] = true;
            }
        }

        System.out.println(newStr);

    }
}
