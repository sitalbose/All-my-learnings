import re
 
logfile=open("serverlog.txt","r")
pattern= r'(\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3})'
pattern2=r'(\d{4})-([a-z])-(\d{2}) (\d{2}):(\d{2}):(\d{2})'

ip_address=[]
dates=[]
for log in logfile:
    ip_adr=re.search(pattern, log)
    date=re.search(pattern2, log)
    ip_address.append(ip_adr.group())
    dates.append(date)
    
    
print(ip_address)
print((dates))