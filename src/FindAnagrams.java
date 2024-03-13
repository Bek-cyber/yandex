import java.util.*;

public class FindAnagrams {

    public static List<Integer> resolve(String s, String p) {
        if(p.length() > s.length())
            return Collections.emptyList();
        Map<Character, Integer> sCount = new HashMap<>(), pCount = new HashMap<>();
        for(char c : p.toCharArray()) {
            pCount.merge(c, 1, Integer::sum);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            sCount.merge(s.charAt(i), 1, Integer::sum);
            if(i >= p.length()) {
                char leftMost = s.charAt(i-p.length());
                int leftMostCount = sCount.get(leftMost);
                if(leftMostCount == 1) {
                    sCount.remove(leftMost);
                } else {
                    sCount.put(leftMost,leftMostCount-1);
                }
            }
            if(pCount.equals(sCount)) {
                result.add(i-p.length()+1);
            }
        }
        return result;
    }
}
