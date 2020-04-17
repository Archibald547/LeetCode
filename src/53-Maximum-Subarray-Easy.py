class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_sum = nums[0]
        cur_sum = 0
        for i in range(len(nums)):
            cur_sum=cur_sum + nums[i]
            if(nums[i]>cur_sum):
                cur_sum=nums[i]
            if(cur_sum>max_sum):
                max_sum=cur_sum
        return max_sum


'''
nums = [-2,1,-3,4,-1,2,1,-5,4]

max_sum = nums[0]
cur_sum = 0
cur_idx = 0
for i in range(len(nums)):
	val = nums[i]
	cur_sum = cur_sum + val
	if(val>cur_sum):
		cur_sum=val
		cur_idx=i
	print(cur_sum)
	if(cur_sum>=max_sum):
		max_sum = cur_sum
	# elif(cur_sum<nums[cur_idx]):
	# 	cur_sum=0
	# 	if(i is not len(nums)-1):
	# 		cur_idx=i+1
	# 	else:
	# 		cur_idx=i
print(max_sum)
print(cur_sum)
print(cur_idx)
'''