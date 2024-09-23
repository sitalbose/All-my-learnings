from unittest import result


def initial(phrase):
    words=phrase.split()
    result=""
    for word in words:
        result+=word[0].upper()
    return result


print(initial("Universal Serial Bus")) # Should be: USB
print(initial("local area network")) # Should be: LAN
print(initial("Operating system")) # Should be: OS




