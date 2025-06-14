package PracticeQuestions;

public class FindpairswithSumk {

    public static void main(String[] args) {

        String str = "sam";
        String str2 = "ams";

        boolean isAnagram = true;

        if (str.length() == str2.length()) {

            for (int i = 0; i < str.length(); i++) {
                if (str2.contains(str.charAt(i) + "")) {
                    isAnagram = true;
                } else {
                    isAnagram = false;
                }
            }

        } else {
             isAnagram = false;
        }
        System.out.println(isAnagram);

    }

}
