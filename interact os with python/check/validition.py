from curses.ascii import isalpha
from operator import truediv



def check_valid(usernames,midlen):
    if midlen < 1:
        raise ValueError("length must at least 1 charcter")
    if usernames < midlen:
        return False
    if usernames.isalpha():
        return False
    return True            
