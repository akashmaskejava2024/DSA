package Basic.Patterns;
public class BUTTERFLY_pattern_In_nbyn {
    public static void main(String[] args) {
        printButterFly(9);
    }
    private static void printButterFly(int n) {
        int first = 2; 
        int last = n-1;
        for(int i = 1; i<= n; i++){
            if(i<=n/2){
                 for(int j = 1; j<= n; j++){
                    if(j<first || j>last){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                 }
                 if(i != n/2 || i != n/2 + 1){
                    first++;
                    last--;
                 }
                 
                    System.out.println();
            } else {
                for(int j = 1; j<= n; j++){
                    if(j>first || j<last){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                 }
                 if(i != n/2 ){
                    first++;
                    last--;
                 }
                    System.out.println();
            }
        }
    }
}
