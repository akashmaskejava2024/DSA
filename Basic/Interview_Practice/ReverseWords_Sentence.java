package Basic.Interview_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseWords_Sentence {

    public static void main(String[] args) {

        String sentence = "Java is fun";
        System.out.println(reverseSentence(sentence));
    }

    private static String reverseSentence(String sentence) {

        String word = "";

        List<String> list = new ArrayList<String>();
        for(int i = 0; i<sentence.length(); i++){

            if(sentence.charAt(i)!=' '){
                word += sentence.charAt(i);
            }

            if(sentence.charAt(i) == ' ' || i == sentence.length()-1){
            
                list.add(word);
                word = "";
            }


        }

        String newStr = "";

        ListIterator<String> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            newStr += it.previous() + " ";
            
        }
        return newStr;

    }
}
