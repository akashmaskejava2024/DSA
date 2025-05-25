package Basic.Strings;

public class ToUpperCase {

    public static void main(String[] args) {

        String str = "hi , I am Akash Maske 123";

        String capitalizedString = capitalizeString(str);

        System.out.println(capitalizedString);

    }

    private static String capitalizeString(String str) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<str.length() ; i++){
            if(str.charAt(i) == ' ' && i< str.length()){
                sb.append(str.charAt(i));
            } else  {
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return sb.toString();

    }

}