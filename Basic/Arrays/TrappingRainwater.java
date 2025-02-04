package Basic.Arrays;

public class TrappingRainwater {
    public static void main(String[] args) {

        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };

        findTrappingRainwater(arr);

    }

    private static void findTrappingRainwater(int[] arr) {
        // for left max Array
        int[] leftMax = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < leftMax[i - 1]) {
                leftMax[i] = leftMax[i - 1];
            } else {
                leftMax[i] = arr[i];
            }
        }

        // For Right Max Array
        int[] rightMax = new int[arr.length];
        rightMax[rightMax.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < rightMax[i + 1]) {
                rightMax[i] = rightMax[i + 1];
            } else {
                rightMax[i] = arr[i];
            }

        }

        int trappedWater = 0;

        for (int i = 0; i < arr.length; i++) {

            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterlevel - arr[i];

        }

        System.out.println("TOtal Water Trapped in the bars is :" + trappedWater);

    }
}

