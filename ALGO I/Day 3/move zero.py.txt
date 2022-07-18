class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        c=0
        while(0 in nums):
            c=c+1
            nums.remove(0)
        for i in range(c):
            nums.append(0)