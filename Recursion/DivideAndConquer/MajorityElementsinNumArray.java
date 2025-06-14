package DivideAndConquer;

public class MajorityElementsinNumArray {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 3, 4, 3, 3, 3, 3, 3, 1, 1, 2, 2 };
        int majorNum = majorityElement(nums, 0, nums.length - 1);
        System.out.println(majorNum);
    }
    public static int majorityElement(int[] nums, int si, int ei) {
        if (ei <= si) {
            return nums[si];
        }
        int mid = si + (ei - si) / 2;
        int leftMajor = majorityElement(nums, si, mid);
        int rightMajor = majorityElement(nums, mid + 1, ei);
        if (leftMajor == rightMajor) {
            return leftMajor;
        }
        int leftCount = countInRange(nums, leftMajor, si, ei);
        int rightCount = countInRange(nums, rightMajor, si, ei);
        if (leftCount > rightCount) {
            return leftMajor;
        } else {
            return rightMajor;
        }
    }
    public static int countInRange(int[] nums, int leftMajor, int si, int ei) {
        int count = 0;
        for (int i = 0; i <= ei; i++) {

            if (nums[i] == leftMajor) {
                count++;
            }
        }
        return count;
    }
}
