package Questions;
public class no_ways_to_call_guest {
   
    public static int callGuest(int n){

        if(n<=1){
            return 1;
        }
        // calling in single way
        int way1 = callGuest(n-1);
        // calling in paired 
        int way2 = (n-1) * callGuest(n-2);
        return way1 + way2;
    }
    public static void main(String[] args) {
        System.out.println(callGuest(4)); 
        
    }
}
