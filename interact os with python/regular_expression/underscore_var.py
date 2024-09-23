


import re
pattern=r"^[a-zA-Z_][a-zA-Z0-9_]*$"
print(re.search(pattern,"_this_is_valid_variable"))