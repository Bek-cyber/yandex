import java.util.ArrayList;
import java.util.List;

public class SortedSquares {

    public static int[] resolve(int[] nums) {
        List<Integer> sqNums = new ArrayList<>();
        for (int el: nums) {
            sqNums.add((int) Math.pow(el, 2));
        }
        var sorted = sqNums.stream().sorted().toList();
        int[] result = new int[sorted.size()];
        for (int i = 0; i < sorted.size(); i++) result[i] = sorted.get(i);

        return result;
    }
}
