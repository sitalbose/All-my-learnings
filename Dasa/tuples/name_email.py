from unittest import result


def full_emails(people):
    result=[]
    for email,name in people:
        result.append("{} <{}>".format(name,email))
        return result
print(full_emails([("sital@example.com","Sital Bose")]))
print(full_emails([("garie@example.com","Garie flex")]))        