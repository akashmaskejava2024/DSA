package Basic;

public class Decimal_To_Binary {

    public static void main(String[] args) {

        int binNum = getDecToBin(10);
        System.out.println("THe Decimal no " + 10 + " in binery is "+ binNum);

    }

    private static int getDecToBin(int decNum) {
    
        int pow = 0;
       int binNum = 0;
       while (decNum >0) {

        int rem = decNum %2 ;



        binNum += rem * (int) Math.pow(10, pow)  ;
        pow++;
        decNum /=2;
        // if(decNum%2 ==0){
            
        //     binNum = binNum*10 + decNum %2 ;
        // } else {
        //     binNum= binNum * 10 + 1;
        // }
        // decNum /= 2;
        
       }

       return binNum;
       
    
    }

}
