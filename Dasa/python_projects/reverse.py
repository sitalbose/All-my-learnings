def reverse_string(s):
    return s[::-1]

def main():
    user_input=input("Enter a String: ")
    
    #call the function
    reversed_string=reverse_string(user_input)
    
    print("Original String:",user_input)
    print("Reverse String",reversed_string)
    
if __name__ == "__main__":
    main()    
    
        