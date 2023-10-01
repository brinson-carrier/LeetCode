class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int track = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != track) {
                track = nums[i];
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}