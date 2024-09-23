filenames = ["program.c", "stdio.hpp", "sample.hpp", "a.out", "math.hpp", "hpp.out"]
new_filesname=[]
for filename in filenames:
    if filename.endswith(".hpp"):
        filename=filename.replace(".hpp",".h")
        new_filesname.append(filename)
    else:
        new_filesname.append(filename)
print(new_filesname)    
