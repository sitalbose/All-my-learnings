def to_seconds(hours, minutes, seconds):
     """Returns the amount of seconds in the given hours, minutes and seconds."""
     return hours*3600+minutes*60+seconds

print(to_seconds(1,40,45))     