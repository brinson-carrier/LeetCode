class Solution {
    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 2, 3};
        int k = removeElement(array, 3);
        System.out.println("k is " + k + "\n");

        int [] array2 = {0, 1, 2, 2, 3, 0, 4, 2};
        k = removeElement(array2, 2);
        System.out.println("k is " + k + "\n");
    }
}
