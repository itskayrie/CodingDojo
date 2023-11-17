class ninja :
    def __init__(self,firstname,lastname,pet,treats,pet_food):
        self.firstname=firstname
        self.lastname=lastname
        self.pet=pet
        self.pet_food=pet_food

    def walk(self):
            self.pet.play()
            return self
    def feed(self):
            self.pet.eat()
            return self
    def bathe(self):
            self.pet.noise()
            return self
    def display_ninja_info(self):
            print(f"my name is {self.first_name}\npet name is{self.pet.name}")
            return self
class pet:
    def __init__(self,name,type,tricks,health,energy):
        self.name=name
        self.type=type
        self.tricks=tricks
        self.health=0
        self.energy=0

        def sleep(self,energy):
            self.energy+=25
            return self
        def eat(self,energy,health):
            self.energy+=5
            self.health+=10
            return self
        def play(self):
            self.health+=5
            return self
        def noise(self):
            print(f"WOOF")
        return self
ninja33=ninja("khaireddine","sougui","dog","oreo","cheese")
pet33=pet("oreeo","jack russel","jump",1,1)
print(ninja33)
print(pet33)
ninja33.display_ninja_info()
        

       