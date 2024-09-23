def counter(start,stop):
    x=start
    if x>stop:
        return_String ="counting down:-"
        while x>=stop:
         return_String += str(x)
         if x>stop:
            return_String+=","
        x-=1 
    else:
         return_String="counting down:-"
         while start<=stop:
            return_String+=str(x)
            if x<stop:
                return_String+=","
                x+=1
            return return_String

print(counter(1,10))
print(counter(2,1))
