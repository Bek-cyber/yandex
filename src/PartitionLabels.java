import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public static List<Integer> resolve(String s) {
        int[] lstIdx = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lstIdx[s.charAt(i) - 'a'] = i;
        }

        List<Integer> result = new ArrayList<>();
        int j = 0, stp = 0;
        for (int i = 0; i < s.length(); i++) {
            j = Math.max(j,lstIdx[s.charAt(i) - 'a']);
            if (i == j) {
                result.add(i - stp + 1);
                stp = i + 1;
            }
        }

        return result;
    }
}
