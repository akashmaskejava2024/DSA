package PracticeRevision.Basic;

public class NoPyramid {
    public static void main(String[] args) {

        printPyramid(5);
    }

    private static void printPyramid(int n) {

        int count = n;

        for(int i = 1; i<= n ; i++){
            for(int j = 0; j< count ; j++){
                System.out.print( " ");
            }
            for(int j = 0 ; j< i; j++){
                System.out.print(i + " ");
            }
            count--;
            System.out.println();
        }


    }
}
