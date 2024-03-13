public class MaxArea {

    public static int resolve(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxS = 0;
        int currentS = 0;
        while (start < end) {
            currentS = Math.min(height[start], height[end]) * (end - start);
            maxS = Math.max(maxS, currentS);
            if (height[start] < height[end]) {
                start++;
            }
            else {
                end--;
            }
        }
        return maxS;
    }
}
