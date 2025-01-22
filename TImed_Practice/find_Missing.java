package TImed_Practice;

public class find_Missing {

    public static void main(String[] args) {
        int[] arr = { 4, 7, 9, 11, 15 };
        int[] arr2 = { 4, 7, 9, 11 };

        findMssingInSecond(arr, arr2);
    }

    public static void findMssingInSecond(int[] arr, int[] arr2) {

        int[] newArr = new int[arr.length + arr2.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        int count = arr.length;
        int j = 0;

        while (count < arr.length + arr2.length ) {

            newArr[count++] = arr2[j++];
        }

        for (int h = 0; h < newArr.length; h++) {
            for (int k = h + 1; k < newArr.length; k++) {
                if (newArr[h] < newArr[k]) {
                    int temp = newArr[k];
                    newArr[k] = newArr[h];
                    newArr[h] = temp;
                }
            }

        }


        for(int l = 1; l< newArr.length; l += 2){
            if(newArr[l] != newArr[l-1]){
                      System.out.println(newArr[l-1]);
                      break;
                    
            }
        }

    }
}
