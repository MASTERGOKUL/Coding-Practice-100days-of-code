/*problem:https://leetcode.com/problems/container-with-most-water/description/ *//
class Solution {
    public int maxArea(int[] height) {
        int min=0;
        int maxarea=0;
        int max=height.length-1;
       while (min < max) {
            int width = max - min;
            maxarea = Math.max(maxarea, Math.min(height[min], height[max]) * width);
            if (height[min] <= height[max]) {
                min++;
            } else {
                max--;
            }
        }
        return maxarea;
    }
}