package PracticeRevision.BitManipulation;

public class FastExponention {
    public static void main(String[] args) {

        int base = 2; 
        int pow =5; 
        int ans = 1; 


        while(pow != 0){
            if((pow & 1) != 0){
                ans = ans * base; 
            }

            base *= base; 
           pow = pow >> 1;
        }

        System.out.println(ans);

    }
}
