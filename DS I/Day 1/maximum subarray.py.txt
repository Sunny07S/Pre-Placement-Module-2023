class Solution:  
    def maxSubArray(self, nums: List[int]) -> int:  # Time: O(n) and Space: O(1)
        maxSub = nums[0]
        curSum = 0
		
        for n in nums:
            if curSum < 0:  # if current sum of elements is negative, let go of previous elements
                curSum = 0  # reset the search for maximum sub array
            curSum += n
            maxSub = max(maxSub, curSum)
			
        return maxSub