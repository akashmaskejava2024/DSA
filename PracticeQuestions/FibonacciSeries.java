package PracticeQuestions;

public class FibonacciSeries {

    public static void main(String[] args) {

        // 0 , 1 , 1, 2, 3, 5

        printFibonacciSeris(20);
    }

    private static void printFibonacciSeris(int n ) {

        System.out.print("0 1 1 ");

        int i =3; 
        int a = 0; 
        int b = 1;
    
        while(i  < n ){
            int c = a + b;
           
            a = b;
            b = c;

            System.out.print( c + " ");
            i++;


        }

       

        

    }
}
