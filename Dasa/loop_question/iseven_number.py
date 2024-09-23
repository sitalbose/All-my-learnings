
def is_even(number):
    if number%2==0:
        return YES
    return NO

print(is_even(12))    

def first_and_last(message):
    if len(message)==0:
     return True
     elif message[0]==message[-1]:
    else:
        return False   

print(first_and_last("else"))
print(first_and_last("tree"))
print(first_and_last(""))