def count_character_frequency(s:str)->dict:
    frequency={}
    
    for char in s:
        if char in frequency:
            frequency[char]+=1
        else:
            frequency[char]=1
            
    return frequency
string = "hello world"
print(count_character_frequency(string))  # Output: {'h': 1, 'e': 1, 'l': 3, 'o': 2, ' ': 1, 'w': 1, 'r': 1, 'd': 1}           