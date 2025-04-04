public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        int max = 1;
        String subString = s.substring(0, 1);
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            int pos = subString.indexOf(String.valueOf(c));
            if (pos != -1) {
                max = Math.max(max, subString.length());
                subString = subString.substring(pos+1);
            }
            subString += c;
        }
        return Math.max(max, subString.length());
    }
}
