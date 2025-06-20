package BackTRacking;

public class FindingSubsets {
    public static void main(String[] args) {

        String str = "abc";
        String newStr = "";
        findSubset(str, newStr, 0);
    }

    private static void findSubset(String str, String newStr, int i) {
        if (i >= str.length()) {
            System.out.println(newStr);
            return;
        }
        findSubset(str, newStr, i + 1);
        newStr += str.charAt(i);
        findSubset(str, newStr, i+ 1);
    }
}
