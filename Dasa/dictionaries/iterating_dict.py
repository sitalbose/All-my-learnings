file_counts={"Jpg":10,"Txt":40,"Csw":2,"Py":4}
for extension in file_counts:
    print(extension)

# if you want values along in keys then we use .items()
for exe,amount in file_counts.items():
    print("There are {} in .{} extension".format(amount,exe))

print(file_counts.keys())

for values in file_counts.values():
    print(values)