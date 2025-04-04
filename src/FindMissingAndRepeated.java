import java.util.HashMap;
import java.util.HashSet;

public class FindMissingAndRepeated {

    /**
     * Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
     * Output: [9,5]
     * Explanation: Number 9 is repeated and number 5 is missing so the answer is [9,5].
     * @param grid
     * @return
     */

    public static int[] findMissingAndRepeated(int[][] grid) {
        int repeated;
        int missed;
        int n = grid.length;
        int expectedSum = (1 + n * n) * n * n / 2;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
                set.add(grid[i][j]);
            }
        }
        int uniqSum = set.stream().mapToInt(i -> i).sum();
        missed = expectedSum - uniqSum;
        repeated = sum + missed - expectedSum;


        return new int[] {repeated,missed};
    }
}
