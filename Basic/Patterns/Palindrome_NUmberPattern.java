package Basic.Patterns;

public class Palindrome_NUmberPattern {
    public static void main(String[] args) {
        printPalindromePattern(5);
                
            }
        
            private static void printPalindromePattern(int n) {
                int count = n-1;
                int num= 1;
                for(int i = 1; i<= n; i++){
                    num=i;
                    for(int j = 1; j<= count; j++){
                            System.out.print("  ");
                       
                    }
                    for(int j = 1; j<=(i*2-1); j++){
                        
                        if(j<i){
                            System.out.print(num + " ");
                            num--;
                        } else {
                            System.out.print(num + " ");
                            num++;
                        }
                    }
                    count--;
                    System.out.println();
                }


            }
}
