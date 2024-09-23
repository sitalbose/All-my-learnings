def fun(file1):
    file1=open("file1.txt",'w')
    s1=input("enter a sentance")
    while(s1!=0):
        file1.write(s1.capitalize())
        s1=input('Enter a sentance:')
file1.close()
file1=open('file1.txt','r')
print(file1.read())
        
        
        