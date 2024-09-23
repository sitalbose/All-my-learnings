from typing import List

def alt_subequence_best(X: List[int]) -> int:
    count=1 if X else 0
    for i in range(1,len(X)):
        if X[i]!=X[i-1]:
            count+=1
    return count

X1=[0,1,0,1,0,1]
print(alt_subequence_best(X1))
X2=[0,1,0,0,1,0]
print(alt_subequence_best(X2))        
           
        