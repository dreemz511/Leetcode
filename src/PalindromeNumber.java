public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        long reverse = 0;
        long temp = x;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        return x == reverse;
    }
}
