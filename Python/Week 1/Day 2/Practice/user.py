class user : 
    def __init__(self, fname, lname, email, age ):
        self.fname = fname
        self.lname= lname
        self.email = email
        self.age =age
        self.is_reward_member = False
        self.gold_card_point = 0

# print all of the user details
    def display_info(self):
        
        
        print(f"my name is {self.fname}\nemail is {self.email}\nage is {self.age}  ")
        # print(f"{self.lname}")
        # print(f"and my email is {self.email}")
        # print(f"and my age {self.age}")
# change the member status and the points
    def enrol(self):
        self.is_reward_member = True
        self.gold_card_point = 200
        print(self.is_reward_member)
        print(self.gold_card_point)
#decrease the user's points
    def spend_point(self, amount):
        self.gold_card_point=self.gold_card_point-amount
        


user1=user("semi","hatab","kiki@gmail.com",25)
user2=user("kayrie","sougui","kai@gmail.com",30)
user1.display_info()
user1.enrol()
user1.spend_point(50)
user1.display_info()
user2.enrol()
user2.spend_point(80)
user2.display_info()

