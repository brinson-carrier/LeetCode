class Solution:
    def hIndex(self, citations: List[int]) -> int:
        low = 0
        high = len(citations)
        while (low < high):
            mid = (low + high + 1) // 2
            count = 0
            for i in citations:
                if (i >= mid):
                    count += 1
            if (count >= mid):
                low = mid
            else:
                high = mid - 1
        return low
        