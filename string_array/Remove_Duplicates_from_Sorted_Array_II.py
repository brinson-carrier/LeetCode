class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 1
        track = nums[0]
        flag = True

        for i in range(1, len(nums)):
            if flag and nums[i] == track:
                nums[k] = nums[i]
                flag = False
                k += 1
            elif nums[i] != track:
                track = nums[i]
                nums[k] = nums[i]
                flag = True
                k += 1
        return k