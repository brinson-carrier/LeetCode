class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        tracker = nums[0]
        counter = 0
        for i in range(0, len(nums)):
            if (nums[i] == tracker):
                counter += 1
            else:
                counter -= 1
                if (counter == 0):
                    tracker = nums[i]
                    counter = 1
        return tracker