def Reverse_array(arr):
    lenght=len(arr)
    
    print("Orginal array")
    for i in range(0,lenght):
        print(arr[i])
        
    print("Reverse array")
    
    for i in range(lenght-1,-1,-1):
        print(arr[i])
        
arr=[1,2,3,4,5,6]
print(Reverse_array(arr))            