package BasicRecursion.AdvancedRecursionQuestion;

public class RemoveDuplicateFromStringUsingRecursion {

    public static void main(String[] args) {

        String str = "apanaacollege";

        removeDuplicate(str,0,new StringBuilder(), new boolean[26]);
    }

    private static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        if( map[str.charAt(idx) - 'a'] == true ){
            //duplicate
            removeDuplicate(str, idx+1, newStr, map);
        } else {
            map[str.charAt(idx) - 'a'] = true;
            newStr.append(str.charAt(idx));
            removeDuplicate(str, idx + 1, newStr, map);
        }
    }

}
