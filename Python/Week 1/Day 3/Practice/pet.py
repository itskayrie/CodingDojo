class Pet:
    def __init__(self,name,type,tricks):
        self.name=name
        self.type=type
        self.tricks=tricks
        self.energy=50
        self.health=50
    def sleep(self):
        self.energy=+25
    def eat(self):
        self.energy+=5
        self.health+=10
    def play(self):
        self.health+=2
    def noise(self):
        if self.type=="dog":
            print("hab hab")
        elif self.type=="cat":
            print("meow")
