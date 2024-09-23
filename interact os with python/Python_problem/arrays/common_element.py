def Common_element(arr1,arr2):
    print("Common elements between the arrays")
    
    for i in range(0,len(arr1)):
        for j in range(0,len(arr2)):
            if arr1[i]==arr2[j]:
                print(arr1[i])

arr1=[2,8,9]
arr2=[2,8,4,5] 
print(Common_element(arr1,arr2))               
                
    