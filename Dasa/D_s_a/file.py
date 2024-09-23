permissions=["create","read","update"]

def check_permission(permission):
    return permission in permissions

print(check_permission('create'))    