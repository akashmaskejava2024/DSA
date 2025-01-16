package Patterns;

public class Hollow_Rhombus {
    public static void main(String[] args) {
        printHollowRhombus(5);
    }

    private static void printHollowRhombus(int n) {

        int count = n-1;
        for(int i = 1; i<= n; i++){
            for(int j = 1;j <= n+count; j++){
                if(j<=count){
                    System.out.print(" ");
                } else {


                    if((j > count+1 && j<count+n) &&(i != 1 && i!=n) ){
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                    
                }
            }
            count--;
            System.out.println();
        }

    }
}
