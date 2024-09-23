from typing import List

def count_distinct_element(nums: List[int])->int:
    distinct_element=set()
    
    for i in nums:
        distinct_element.add(i)
    return len(distinct_element)
    
nums = [1, 2, 3, 4, 1, 2, 3, 4, 5]
print(count_distinct_element(nums))  # Output: 5 (The distinct elements in the entire array are 1, 2, 3, 4, and 5)