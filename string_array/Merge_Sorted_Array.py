class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        
        temp = nums1[:m]
        
        index_t = 0
        index_1 = 0
        index_2 = 0

        while m > index_t and n > index_2:
            if temp[index_t] < nums2[index_2]:
                nums1[index_1] = temp[index_t]
                index_1 += 1
                index_t += 1
            else:
                nums1[index_1] = nums2[index_2]
                index_1 += 1
                index_2 += 1

        while m > index_t:
            nums1[index_1] = temp[index_t]
            index_1 += 1
            index_t += 1

        while n > index_2:
            nums1[index_1] = nums2[index_2]
            index_1 += 1
            index_2 += 1