package Patterns;

public class Diamond_Pattern {
    public static void main(String[] args) {
        printDiamondPattern(9);
    }

    private static void printDiamondPattern(int n) {
       
            int first = n/2+1;
            int last = n/2+1;
            for(int i = 1; i<= n/2+1; i++){
                for(int j = 1; j<=n;j++){
                    if(j < first || j > last){
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                   
                }
                first--;
                last++;
                System.out.println();

            }
             first = 1;
             last = n;
            for(int i = 1; i<= n/2+1; i++){
                for(int j = 1; j<=n;j++){
                    if(j >= first && j <= last){
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
