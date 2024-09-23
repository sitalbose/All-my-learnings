import re
print(re.search(r"[Pp]ython","Python"))

print(re.search("cloud[a-zA-z0-9]","cloudy9"))

print(re.search(r"cat|dog" ,"I like cat and dogs both"))

print(re.findall(r"cat|dog", "I like both cat and dogs"))