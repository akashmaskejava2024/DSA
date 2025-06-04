
public class print_ntothepowerx {
    static int ans = 1;
    
    public static int power(int x, int n){

        if(x == 0){
            return 0;
        }
        if(n == 0)
        return 1;
 
      return  ans = x * power(x, n-1);
        
    }
    public static void main(String[] args) {
        power(2, 5);
        System.out.println(ans);
    }

    
}
