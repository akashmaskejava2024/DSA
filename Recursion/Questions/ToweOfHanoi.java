public class ToweOfHanoi {
    
    public static void Tower(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("transfer " + n + " from " + src + " to the " + dest );
            return;
        }
        // transfer n-1 from src  to helper
        Tower(n-1, src, dest, helper);
        // transfer n from src to dest
        System.out.println("transfer " + n + " from " + src + " to the " + dest );
        // transfer n-1 from helper to dest
        Tower(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        Tower(5, "s", "H", "d");
    }
}
