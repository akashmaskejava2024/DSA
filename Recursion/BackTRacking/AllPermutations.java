package BackTRacking;

public class AllPermutations {
    public static void main(String[] args) {
        String str = "abc";
        String newStr = "";
        findpermutaions(str, newStr);
    }
    public static void findpermutaions(String str, String newStr) {
        if(str.length() == 0){
            System.out.println(newStr);
            return;
        }
        for(int i  =0; i<str.length(); i++){
            char ch = str.charAt(i);
           String  testStr = str.substring(0, i) + str.substring(i+1);
            findpermutaions(testStr, newStr + ch);
        }
    } 
}
