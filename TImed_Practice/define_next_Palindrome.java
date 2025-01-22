package TImed_Practice;

public class define_next_Palindrome {


    public static void main(String[] args ){

        int n = 1234;

        findNExtPalindrome(n);
    }

    public static void findNExtPalindrome(int n ){

        Integer count = n+1;
        while( count > n){


            String str = count.toString();

            String revStr = "";
            for(int i = str.length() -1 ; i>=0; i--){

                revStr += str.charAt(i);


            }
            if(str.equals(revStr)){
                 System.out.println(str);
                 return;
            }


            count++;



        }


    }


}
