package Questions;
public class first_last_occur_of_char {
    static int first = -1;
    static int last = -1;

    public static void findIndex(String str, char c, int index) {
        if (index == str.length()) {
            return;
        }
        if (str.charAt(index) == c) {

            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findIndex(str, c, index + 1);
    }
    public static void main(String[] args) {
        findIndex("aaaksa", 'a', 0);
        System.out.println(first);
        System.out.println(last);
    }
}
