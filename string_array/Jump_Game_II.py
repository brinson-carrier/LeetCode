class Solution:
    def jump(self, nums: List[int]) -> int:
        nextIndex = 0
        currentIndex = 0
        jumps = 0
        for i in range(0, len(nums) - 1):
            nextIndex = max(nextIndex, i + nums[i])
            if (nextIndex >= len(nums) - 1):
                jumps += 1
                return jumps
            if (i == currentIndex):
                jumps += 1
                currentIndex = nextIndex
        return jumps