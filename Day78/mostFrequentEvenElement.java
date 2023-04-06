//problems : https://leetcode.com/problems/most-frequent-even-element/description/
class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> ans = new HashMap<>();
        for (int i : nums) {
            if (i % 2 == 0) {
                ans.put(i, ans.getOrDefault(i, 0) + 1);
            }
        }
        int result = -1, mx = 0;
        for (var y : ans.entrySet()) {
            int x = y.getKey(), t = y.getValue();
            if (mx < t || (mx == t && result > x)) {
                mx = t;
                result = x;
            }
        }
        return result;
    }
}