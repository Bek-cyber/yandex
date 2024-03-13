import java.util.HashMap;
import java.util.Map;

public class SubarraySum {

    public static int resolve(int[] nums, int k) {
        int counter = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int idx = 0; idx < nums.length; idx++) {
            sum += nums[idx];
            if (map.containsKey(sum - k)) counter += map.get(sum - k);
            map.put(sum, (map.getOrDefault(sum, 0) + 1));
        }
        return counter;
    }
}
