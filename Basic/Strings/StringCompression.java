package Basic.Strings;

import Basic.Interview_Practice.count_no_chars;

public class StringCompression {
    public static void main(String[] args) {

        String str = "aaaabbbcddd";

        String compressedString = compressString(str);
        System.out.println(compressedString);
    }

    private static String compressString(String str) {
        String countStr = "";
        for (int i = 1; i < str.length(); i++) {
            int count = 1;
                while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                    count++;
                        i++;
                }
                countStr += str.charAt(i);
                if(count > 1){
                    countStr += count;
                }
            }
        return countStr;
    }
}
