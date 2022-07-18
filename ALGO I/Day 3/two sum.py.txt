class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        i=0
        j=len(numbers)-1
        n=len(numbers)
        while 0<=i<j<n:
            addition = numbers[i]+numbers[j]
            if addition==target:
                return [i+1,j+1]
            elif addition<target:
                i=i+1
            elif addition>target:
                j=j-1