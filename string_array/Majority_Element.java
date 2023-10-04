class Solution {
    public int majorityElement(int[] nums) {
        int tracker = nums[0];
        int counter = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == tracker) {
                counter++;
            }
            else {
                counter--;
                if (counter == 0) {
                    tracker = nums[i];
                    counter = 1;
                }
            }
        }
        return tracker;
    }
}