from unicodedata import name


class piglet:
    name="piglet"
    def speak(self):      # thats how we define function a function method of a class
      
        print("oink oink I'm {} ".format(self.name))

hamplet=piglet()
hamplet.name="Hamplet"
hamplet.speak()   

petunia =piglet()
petunia.name="petunia"
petunia.speak()

