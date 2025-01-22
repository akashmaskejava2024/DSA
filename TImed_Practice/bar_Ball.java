package TImed_Practice;

public class bar_Ball {

    public static void main(String[] args) {

        int sum = 30;
        int diff = 5;

        findBatandball(sum, diff);
    }

    private static void findBatandball(int sum, int diff) {

        double bat = (sum + diff) / 2.0f;
        double ball = (sum - diff) / 2.0f;
     
         
        if (bat + ball == sum && bat - ball == diff) {
            System.out.println("Bat = " +(int) bat + ", Ball = " +(int) ball);
        } else {
            System.out.println("No valid solution.");
        }
       
            
           
           
        
       


    }

}