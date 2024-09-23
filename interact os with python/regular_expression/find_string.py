log="July 31 07:51:48 mycomputer bad_process[12345]:Error Performing"
index=log.index("[")
print(log[index+1:index +6])