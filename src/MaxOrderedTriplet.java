import java.util.List;

public class MaxOrderedTriplet {

    /**
     * Input: nums = [1,10,3,4,19]
     * Output: 133
     * Explanation: The value of the triplet (1, 2, 4) is (nums[1] - nums[2]) * nums[4] = 133.
     * @param a
     * @return long
     */

    public static long maxTriplet(int[] a) {
        long maxVal = 0;
        long maxDiff = 0;
        long maxAns = 0;

        if (a.length == 3) return Math.max((long) (a[0] - a[1]) * a[2], 0);
        else {
            for (int i = 0; i < a.length; i++) {
                maxAns = Math.max(maxAns, maxDiff * a[i]);
                maxDiff = Math.max(maxDiff, maxVal - a[i]);
                maxVal = Math.max(maxVal, a[i]);
            }
        }
        return Math.max(maxAns, 0);
    }
}
