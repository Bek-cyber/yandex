import java.util.Arrays;

public class CheckInclusion {

    public static boolean checkInclusion(String s1, String s2) {
        s1 = sortString(s1);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (s1.equals(sortString(s2.substring(i, i + s1.length()))))
                return true;
        }
        return false;
    }

    public static String sortString(String s) {
        char[] t = s.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }
}
