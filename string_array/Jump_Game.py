class Solution:
    def canJump(self, nums: List[int]) -> bool:
        reach = nums[0]
        for i in range(0, len(nums)):
            if (i > reach):
                return False
            reach = max(reach, i + nums[i])
        return True