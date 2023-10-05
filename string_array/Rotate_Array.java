class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        if (k == 0) return;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int j, int k) {
        int swap;
        while (j < k) {
            swap = nums[k];
            nums[k--] = nums[j];
            nums[j++] = swap;
        }
    }
}