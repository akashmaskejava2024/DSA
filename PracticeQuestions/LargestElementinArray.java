package PracticeQuestions;

public class LargestElementinArray {
    public static void main(String[] args) {
        int[] arr ={1,2,33,45,65,86};

        int max = Math.max(arr[0], arr[1]);
        
        int secMax = Math.min(arr[0], arr[1]);

        for(int i =2 ; i < arr.length; i++ ){
            if(arr[i] > secMax){
                if(arr[i] > max){
                    secMax = max;
                    max = arr[i];
                } else {
                    secMax = arr[i];
                }
            }
        }

        System.out.println(secMax);
    }
}
