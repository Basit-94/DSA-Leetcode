class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        seen = dict()

        for index,num in enumerate(nums) :
            temp = target - num
            if temp in seen : 
                return [index,seen.get(temp)]
            seen[num] = index