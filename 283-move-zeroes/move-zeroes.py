class Solution:
    def moveZeroes(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i=0
        while i<len(nums) and nums[i]!=0 :
            i += 1

        j = i+1

        while i < j and j < len(nums) :
            if nums[j] != 0 :
                nums[i],nums[j] = nums[j],nums[i]
            while nums[i]!=0 :
                i += 1
            j += 1