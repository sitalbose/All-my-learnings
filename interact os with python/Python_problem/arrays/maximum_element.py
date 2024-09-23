#find the maximum element in array
def max(arr):
    max_element=arr[0]
    for num in arr:
        if num>max_element:
            max_element=num
            
    return max_element

arr=[4,8,10,45,89]
print(max(arr))   
    