package Questions;
public class Remove_Duplicates_String {
    static String newStr = "";
    public static boolean[] map = new boolean[26];

    public static void remove_dupicate(String str , int index   ){
        if(index == str.length())
        return;
        if(map[str.charAt(index) - 'a']){
            remove_dupicate(str, index+1);
        } else {
            newStr+=str.charAt(index);
            map[str.charAt(index) - 'a'] = true;
            remove_dupicate(str, index+1);
        }
    }
    public static void main(String[] args) {
        String str = "abbalskdfhasfhhdtdtgggeeecdd";
        newStr += str.charAt(0);
        remove_dupicate(str, 1);
        System.out.println(newStr);
    }
}
