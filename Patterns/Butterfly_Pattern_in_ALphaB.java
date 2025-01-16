package Patterns;

public class Butterfly_Pattern_in_ALphaB {

    public static void main(String[] args) {
        
        printButterfly(4);
            }
        
            private static void printButterfly(int n) {
                
                int first = 2;
                int last = n*2-1;
               
                for(int i = 1; i<=n; i++){

                    for(int j = 1; j<=n*2; j++){
                        if(j<first || j> last){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        } 
                    }
                    first++;
                    last--;
                    System.out.println();
                }
                first = n;
                last = n+1;
                
                for(int i = 1; i<=n; i++){

                    for(int j = 1; j<=n*2; j++){
                        if(j>first || j<last){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        } 
                    }
                    first++;
                    last--;
                    System.out.println();
                }
            }
    

}
