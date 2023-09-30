class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        
        for (int i = 0; i < m; ++i) {
            temp[i] = nums1[i];
        }

        int index_t = 0;
        int index_1 = 0;
        int index_2 = 0;

        while (m > index_t && n > index_2) {
            if (temp[index_t] < nums2[index_2]) {
                nums1[index_1++] = temp[index_t++];
            }
            else  {
                nums1[index_1++] = nums2[index_2++];
            }
        }

        while (m > index_t) {
            nums1[index_1++] = temp[index_t++];
        }

        while (n > index_2) {
            nums1[index_1++] = nums2[index_2++];
        }
    }
}