def palindrome(str):
    if str==str[::-1]:
        return "The String is Palindrome"
    else:
        return "The String is not Palindrome"
    
str="madam"
print(palindrome(str))    