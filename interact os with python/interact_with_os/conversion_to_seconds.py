def to_seconds(hours,minutes,seconds):
    return hours*3600+minutes*60+seconds

print("Welcome to this converter")


cout="y"

while(cout.lower()=="y"):

    hours=int(input("Enter the number of hours:"))
    minutes=int(input("Enter the number of minutes:"))
    seconds=int(input("Enter the number of seconds:"))

    print("Thats {} seconds".format(to_seconds(hours,minutes,seconds)))
    print()
    cout=input("Do you want another conversion? [y to continue] ")


