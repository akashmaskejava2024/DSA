package Basic.Interview_Practice;

public class Diamond_Pattern_with_No {
    public static void main(String[] args) {
        int n = 5;
        printNumberPyramid(n);
    }

    private static void printNumberPyramid(int n) {
        int spaces = n-1;
        int count = 0;

        for(int i = 0; i<=n; i++){

            for(int j = spaces; j>=0;j--){
                System.out.print("  ");
            }

            for(int j = 0; j<count;j++){
                System.out.print(1+j + " ");
            }
            for(int j = count-2; j>=0; j--){
                System.out.print(1+j+ " ");
            }
            spaces--;
            count++;
            System.out.println();

        }
        spaces = 0;
         count = n-1;
        for(int i = 0; i<=n; i++){

            for(int j = 0; j<=spaces;j++){
                System.out.print("  ");
            }

            for(int j = 0; j<count;j++){
                System.out.print(1+j + " ");
            }
            for(int j = count-2; j>=0; j--){
                System.out.print(1+j+ " ");
            }
            spaces++;
            count--;
            System.out.println();

        }

    }
}
