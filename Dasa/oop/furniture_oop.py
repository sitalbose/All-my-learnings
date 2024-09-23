from turtle import pen


class furtinature():
    color=""
    material=""

table = furtinature()
table.color="brown"
table.material="wood"

sofa= furtinature()
sofa.color="white"
sofa.material="leather"

def describe_furtinature(pieces):
    return ("This piece of furniture is made of {} {}".format(pieces.color,pieces.material))

print(describe_furtinature(table))
print(describe_furtinature(sofa))
