public class move_all_x_to_end {

    static String onlyX = "";
    static String withoutX = "";

    public static void moveToEnd(String str, int index) {
        if (index == str.length() - 1) {
            System.out.println(withoutX + onlyX);
            return;
        }
        if (str.charAt(index) == 'x') {
            onlyX += "x";
        } else {
            withoutX += str.charAt(index);
        }
        moveToEnd(str, index + 1);
    }

    public static void main(String[] args) {
        moveToEnd("axsxgxxjs", 0);
    }
}
