package Basic.Interview_Practice;

public class first_nonReapiting_Char {

    public static void main(String[] args) {

        String str = "SWISSW";
        printfirstNonRepeatingNo(str);
    }

    private static void printfirstNonRepeatingNo(String str) {


        int count = 0;
        for(int i =0 ;i<str.length(); i++){
            for(int j = i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                    continue;
                } 
            }

            if(count == 0){
                System.out.println(str.charAt(i));
                break;
            } 
            count = 0;
        }
    }   
}
