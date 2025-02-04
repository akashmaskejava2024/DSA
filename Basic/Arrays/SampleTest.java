package Basic.Arrays;

import java.util.HashMap;
import java.util.Map;

public class SampleTest {
    public static void main(String[] args) {


          int arr[] ={3,3,4};
          Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }

        int maxRepeat = Integer.MIN_VALUE;
        int key = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxRepeat) {
                maxRepeat = entry.getValue();
                key = entry.getKey();
            }

        }

        System.out.println(key);
    }
}
