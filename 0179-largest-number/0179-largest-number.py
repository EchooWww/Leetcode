class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        str_array = list(map(str, nums))
        str_array.sort(key = cmp_to_key(lambda a,b :(b+a>a+b) - (a+b> b+a)))
        res = ('').join(str_array)
        return '0' if res[0] == '0'else res
        