package Basic.Interview_Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate {
    public static void main(String[] args) {
        String str = "programming";

        System.out.println(removeDuplicate(str));
            }
        
            private static String removeDuplicate(String str) {

                Set<Character> set = new LinkedHashSet<>();

                for(int i = 0; i<str.length();i++ ){
                    set.add(str.charAt(i));
                }

                String newStr = "";
                for(Character c : set){
                            newStr+=c;
                }

                return newStr;



            }
}
