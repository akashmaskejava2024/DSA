package DivideAndConquer;

public class MergeSortStringArray {
    public static void main(String[] args) {

        String[] arr = { "sun", "earth", "mars", "mercury" };
        mergeSort(arr, 0, arr.length - 1);
        for(String str : arr){
            System.out.print(str + " ");
        }
    }
    public static void mergeSort(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(String[] arr, int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];
        int i = si; 
        int j = mid + 1; 
        int k = 0; 
        while(i <= mid && j <= ei){
            if(isSecondStringGreaterinDictionary(arr[i], arr[j])){
                temp[k++] = arr[i++];
            } else {
                 temp[k++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        for(i = si, k = 0; k<temp.length ; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static boolean isSecondStringGreaterinDictionary( String str1, String  str2){

        int i = 0 ;
        int j = 0; 
        while(i < str1.length() && j < str2.length()){
            if(str1.charAt(i++) > str2.charAt(j++)){
                return false;
            } else {
                return true;
            }
        }
        return str1.length() <= str2.length();
        // if(str1.compareTo(str2) < 0){
        //     return true;
        // }

        // return false;
    }
}     
