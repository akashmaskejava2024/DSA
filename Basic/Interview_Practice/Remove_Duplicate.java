package Basic.Interview_Practice;

// import java.util.LinkedHashSet;
// import java.util.Set;

public class Remove_Duplicate {
    public static void main(String[] args) {
        String str = "programming";

        removeDuplicate(str);
    }

    private static void removeDuplicate(String str) {

        char[] arr = sortArray(str.toCharArray());
        char[] newArr = new char[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                newArr[count++] = arr[i];
            }

        }

        for (int i = 0; i < count; i++) {
            System.out.print(newArr[i] + " ");
        }

    }

    private static char[] sortArray(char[] charArray) {

        for (int i = 0; i < charArray.length; i++) {

            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] < charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;

                }
            }

        }
        return charArray;

    }

    // private static String removeDuplicate(String str) {

    // Set<Character> set = new LinkedHashSet<>();

    // for (int i = 0; i < str.length(); i++) {
    // set.add(str.charAt(i));
    // }

    // String newStr = "";
    // for (Character c : set) {
    // newStr += c;
    // }

    // return newStr;

    // }
}
