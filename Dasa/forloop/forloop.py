def square(n):
    return n*n

def sum_sqaure(x):
    sum=0
    for n in range(x):
        sum+=square(n)
    return sum
print(sum_sqaure(10)) 

