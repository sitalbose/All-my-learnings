with open("file.txt") as file:
    for line in file:
        print(line.upper())

# there is an empty line between contents
# to avoid it write strip
print()

with open("file.txt") as file:
    for line in file:
        print(line.strip().upper())
