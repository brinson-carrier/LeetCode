class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int track = nums[0];
        boolean flag = true;

        for (int i = 1; i < nums.length; ++i) {
            if (flag && nums[i] == track) {
                nums[k++] = nums[i];
                flag = false;
            }
            else if (nums[i] != track) {
                track = nums[i];
                nums[k++] = nums[i];
                flag = true;
            }
        }
        return k;
    }
}