class person:
    def __init__(self,name):
        self.name=name
    def greetings(self):
        return "hi, my name is {}".format(self.name)

some_person = person("Ronnie")  
# Call the greeting method
print(some_person.greetings())           