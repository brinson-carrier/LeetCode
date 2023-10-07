class Solution {
    public int jump(int[] nums) {
        int currentIndex = 0;
        int nextIndex = 0;
        int jumps = 0;
        for (int i = 0; i < nums.length -1; ++i) {
            nextIndex = Math.max(nextIndex, i + nums[i]);
            if (nextIndex >= nums.length - 1) {
                return ++jumps;
            }
            if (i == currentIndex) {
                ++jumps;
                currentIndex = nextIndex;
            }
        }
        return jumps;
    }
}