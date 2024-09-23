#Given an array of 'N' integers, the cost of a range (subarray) is defined as the sum of the values in the range squared. That is, if the sum of the values of the range is S, its cost is S^2

#Your task is to determine the largest cost of any contiguous subarray within the given array

#Examples 1: Input arr[1,-1,1,-1,1] Output 1 Explanation: The maximum sum is 1, and its square is 1

#Examples 2: Input an [1, 2, 3] Output 36 Explanation. The sum of the entire array is 6, and its square is 36

from typing import List

def squared_sum(X: List[int])->int:
    max_sum=float('-inf')
    current_sum=0
    
    for num in X:
       current_sum=max(num,current_sum+num)
       max_sum=max(max_sum, current_sum)
       
    return max_sum**2    
List1=[1,2,3]
print(squared_sum(List1))

List2=[1,2,3,4]
print(squared_sum(List2))            
    