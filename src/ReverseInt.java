public class ReverseInt {

    public static int reverse(int x) {
        long temp = x; // 123 -> 321
        long ans = 0;
        while (temp != 0) {
            ans = ans * 10 + temp % 10;
            if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
                return 0;
            temp /= 10;
        }
        return (int) ans;
    }
}
