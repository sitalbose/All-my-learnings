import re
print(re.search(r"p?each","to each their own"))

print(re.search(r"p?each", "I like peaches"))

#.* covers all the letters in between

print(re.search(r"A.*a","Australia"))

#^A.*a$ here we can a word should start with A and ends with a
print(re.search(r"^A.*a$","Australian"))