def into_latin(text):
    words=text.split()
    pigged_text=[]
    for word in words:
        word=word[1:]+word[0]+'ay'
        pigged_text.append(word)
    return pigged_text    

print(into_latin("hello how are you")) # Should be "ellohay owhay reaay ouyay"
print(into_latin("programming in python is fun")) # Should be "rogrammingpay niay ythonpay siay unfay"