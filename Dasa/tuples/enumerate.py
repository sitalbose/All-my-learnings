def skip_elememts(elements):
    new_list=[]
    for index,element in enumerate(elements):
        if index%2==0:
            new_list.append('{}'.format(element))
    return new_list
print(skip_elememts(['a','b','c','d','e','f','g'])) 
print(skip_elememts(['Orange', 'Pineapple', 'Strawberry', 'Kiwi', 'Peach']))