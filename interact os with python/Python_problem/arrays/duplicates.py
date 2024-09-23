#print the duplicates in a given a array

def Duplicates(arr):
    lenght=len(arr)
    print("Duplicates values are")
    
    for i in range(0,lenght):
        for j in range(i+1,lenght):
            if arr[i]==arr[j]:
                print(arr[i])

arr=[1,2,2,7,8,8,9,9]
print(Duplicates(arr))            
            