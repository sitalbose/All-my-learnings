import re

target_string = "Abraham Lincoln was born on February 12, 1809,"
# \d to match digits
res = re.search(r'\d{4}', target_string)
# match value
print(res.group()) 