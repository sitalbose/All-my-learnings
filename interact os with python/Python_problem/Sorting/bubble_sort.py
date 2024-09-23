def Bubble_sort(arr):
    n=len(arr)
    
    for i in range(0,n):
        for j in range(0,n-i-1):
            if arr[j]>arr[j+1]:
                arr[j],arr[j+1]=arr[j+1],arr[j]
                
    return arr

arr=[7,2,9,4,6,5]
print(Bubble_sort(arr))            
    