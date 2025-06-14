package Questions;
public class all_permutations_String {
    public static void permutation(String str , String permutations){
        if(str.length() == 0    ){
            System.out.println(permutations);
            return;
        }
        for(int i = 0; i<str.length(); i++  ){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            // taken out the current char from the strig ad added to the permutations
            permutation(newStr, permutations+currChar);
        }
    }
    public static void main(String[] args) {
        permutation("abs", "");
    }
}
