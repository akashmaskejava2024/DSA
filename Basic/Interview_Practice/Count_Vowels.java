package Basic.Interview_Practice;

public class Count_Vowels {
    public static void main(String[] args) {
        String str = "pineapple";
        System.out.println(countVowels(str));
    }

    private static int countVowels(String str) {

        int count = 0;
        for(int i = 0; i<str.length(); i++){
            String newStr = str.charAt(i)+"";
            if((newStr.equalsIgnoreCase("a")) || (newStr.equalsIgnoreCase("e")) || (newStr.equalsIgnoreCase("i"))|| (newStr.equalsIgnoreCase("o"))|| (newStr.equalsIgnoreCase("u"))){
              count++;
            }
        }
    return count;
    
    }
}
