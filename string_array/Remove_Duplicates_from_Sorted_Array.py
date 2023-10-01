class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 1;
        track = nums[0]
        for i in nums:
            if i != track:
                track = i
                nums[k] = i
                k += 1
        return k