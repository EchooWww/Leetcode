class Solution:
    def hIndex(self, citations: List[int]) -> int:
        h = 0
        # max h that: >= h papers has been cited >= h times
        citations.sort()
        for i in range(len(citations)):
            h = max(h, min(len(citations) - i, citations[i]))

        return h


