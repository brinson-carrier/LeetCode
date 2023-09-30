You are given two integer arrays `nums1` and `nums2`, sorted in **non-decreasing order**, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.

**Merge** `nums1` and `nums2` into a single array sorted in **non-decreasing order**.

The final sorted array should not be returned by the function, but instead be _stored inside the array_ `nums1`. To accommodate this, `nums1` has a length of `m + n`, where the first `m` elements denote the elements that should be merged, and the last `n` elements are set to `0` and should be ignored. `nums2` has a length of `n`.

**Example 1:**

**Input:** nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
**Output:** [1,2,2,3,5,6]
**Explanation:** The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

**Example 2:**

**Input:** nums1 = [1], m = 1, nums2 = [], n = 0
**Output:** [1]
**Explanation:** The arrays we are merging are [1] and [].
The result of the merge is [1].

**Example 3:**

**Input:** nums1 = [0], m = 0, nums2 = [1], n = 1
**Output:** [1]
**Explanation:** The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

How I solved :
	Create a temporary array of size m and populate it with the contents of nums1 that are not 0.  
	Create 3 int variables, initlized to 0, one for each of the arrays indexing the next value to be evaluated (for nums2 and temp) or inserted (for nums1). 
	Create a while loop with prameters that it will only iterate while values from both temp array and nums2 have not been exausted. Picking the smaller of the two nums2 or temp at their indexes and inserting that number into the nums1 and its index value. Iterate the nums1 index and the index for the array that was selected.
	Since at this point one of the arrays is exhausted only one of the following while loops will run.
	Create two while loops one for the temp array and one for nums2. The while loop will iterate while the array in its parameters is not exhausted.  The contents of the while loop place the value at the index source array into nums1 at the indexed value and then iterates the index of the arrays.