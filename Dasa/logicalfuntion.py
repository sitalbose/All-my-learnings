def number_group(number):
 if number>0:
  return "positive"
 elif number==0:
  return "Zero"
 else:
  return "negative"   

print(number_group(10)) #Should be Positive
print(number_group(0)) #Should be Zero
print(number_group(-5)) #Should be Negative

#2
def greeting(name):
  if name == "Taylor":
    return "Welcome back Taylor!"
  else:
    return "Hello there, " + name



