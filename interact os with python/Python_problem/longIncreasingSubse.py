from typing import List

def longest_increasing_subsequence(nums: List[int]) -> int:
    if not nums:
        return 0
    
    n = len(nums)
    dp = [1] * n
    
    for i in range(1, n):
        for j in range(i):
            if nums[i] > nums[j]:
                dp[i] = max(dp[i], dp[j] + 1)
    
    return max(dp)

# Test cases
nums1 = [10, 9, 2, 5, 3, 7, 101, 18]
print(longest_increasing_subsequence(nums1))  # Output: 4 (The LIS is [2, 3, 7, 101])

nums2 = [0, 1, 0, 3, 2, 3]
print(longest_increasing_subsequence(nums2))  # Output: 4 (The LIS is [0, 1, 2, 3])
