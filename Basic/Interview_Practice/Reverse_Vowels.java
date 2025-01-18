package Basic.Interview_Practice;

public class Reverse_Vowels {
    public static void main(String[] args) {
        String str = "akhulktuakoi";
        System.out.println(str);
        reverseViwels(str);

    }

    private static void reverseViwels(String str) {

        int first = 0;
        int last = str.length() - 1;
        char[] arr = str.toCharArray();

        while (first <= last) {

            if (checkIfVowel(arr[first])) {
                if (checkIfVowel(arr[last])) {

                    char temp = arr[first];
                    arr[first] = arr[last];
                    arr[last] = temp;
                    first++;
                    last--;

                } else {
                    last--;
                }

            } else {
                first++;
            }

        }

        for (char c : arr) {
            System.out.print(c);
        }

    }

    private static boolean checkIfVowel(char charAt) {

        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (char v : vowels) {
            if (charAt == v) {
                return true;
            }
        }

        return false;

    }
}
