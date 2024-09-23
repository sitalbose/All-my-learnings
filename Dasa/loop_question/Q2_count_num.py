
def count_digit(number):
    count=0
    if number==0:
     return 1
    while number>0:
       count+=1
       number=number//10
    return count
print(count_digit(125))
print(count_digit(235))
print(count_digit(2)) 

