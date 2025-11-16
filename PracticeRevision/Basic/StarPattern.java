package PracticeRevision.Basic;

public class StarPattern {
    public static void main(String[] args) {
        printStarNo(33);
    }

    private static void printStarNo(int n) {

        int count = 1; 

        for(int i = 0; i<= n / 10; i++){
        
            if(i < n / 10){
                for(int j = 0; j < 10 ; j++){
                    if(j < 6){
                        System.out.print("*");
                        count++;
                    }else{
                        System.out.print(count++);
                    }
                }
                System.out.println();
            }else {
                for(int j = 0; j< n %10; j++){
                    if(j < 6){
                        System.out.print("*");
                        count++;
                    }else{
                        System.out.print(count++);
                    }
                }
            }

        }


    }

}
