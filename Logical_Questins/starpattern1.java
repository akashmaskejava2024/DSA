package Logical_Questins;

public class starpattern1 {

    public static void main(String[] args) {

        // intializaiotn
        // condition
        // increment


        String str = "akash";
        char[] arr = str.toCharArray();
        int first = 0; 
        int last = str.length() -1; 
        while(last >= first){
            char temp = arr[last]; 
            arr[last] = arr[first];
            arr[first] = temp; 

            first++;
            last--;
        }
       
        str = "";
        for(char c : arr){
           str += c;
        }

        System.out.println(str);
       

    }

}
// *****
// *   *
// *   *
// *   *
// *****

// outer loop 
// inner loop 
// first condition if i =0 and i = n -1 print comlete star 
// se=cond j =0 and j = n -1  * else " " 
