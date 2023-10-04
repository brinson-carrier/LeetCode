class Solution:
    def reverse(self, nums: List[int], j: int, k: int) -> None:
        while j < k:
            nums[j], nums[k] = nums[k], nums[j]
            j += 1
            k -= 1
    def rotate(self, nums: List[int], k: int) -> None:
        k = k % len(nums)
        if (k == 0):
            return
        self.reverse(nums, 0, len(nums) - 1)
        self.reverse(nums, 0, k - 1)
        self.reverse(nums, k, len(nums) - 1)