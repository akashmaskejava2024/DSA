package Basic.Interview_Practice;

public class GCD_of_two_no {

    public static void main(String[] args) {
        int firstNo = 60;
        int secNo = 36;

        findGCD(firstNo, secNo);
    }

    private static void findGCD(int firstNo, int secNo) {

        int GCD=0;

        for(int i= 2; i<Math.min(secNo, firstNo); i++){
            if(secNo%i==0 && firstNo%i==0){
                GCD = i;
            }
        }
        System.out.println("GCD is " + GCD);
    }
}
