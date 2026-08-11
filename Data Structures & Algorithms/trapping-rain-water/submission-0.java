class Solution {
    public int trap(int[] height) {
        int leftMax = height[0];
        int rightMax = height[height.length - 1];
        int l = 0, r = height.length - 1;
        int ans = 0;
        while(l <= r) {
            if(height[l] <= height[r]) {
                leftMax = Math.max(leftMax, height[l]);
                ans += (leftMax - height[l++]);
            } else {
                rightMax = Math.max(rightMax, height[r]);
                ans += (rightMax - height[r--]);
            }
        }
        return ans;
    }
}
