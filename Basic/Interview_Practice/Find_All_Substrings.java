package Basic.Interview_Practice;

public class Find_All_Substrings {

    public static void main(String[] args) {
        String str = "abcd";

        printAllSubstrings(str);

    }

    private static void printAllSubstrings(String str) {

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {
                {
                    System.out.print(str.substring(i, j) + " ");
                }

            }

        }

    }
}