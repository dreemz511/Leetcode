import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {3,3};
        int target = 6;
        TwoSum.twoSum(arr, target);
        System.out.println(Arrays.toString(TwoSum.twoSum(arr, target)));
        System.out.println(ReverseInt.reverse(1534236469));
    }
}