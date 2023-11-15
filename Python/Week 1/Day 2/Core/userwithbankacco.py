class backaccount :
    def __init__(self, int_rate, balance ):
        self.int_rate = int_rate
        self.balance = balance
        

    def deposit(self, amount):
        self.balance += amount
        
    def withdraw(self,amount):
        if (self.balance >= 0):
            self.balance-=amount
        else :
            print("insufficient funds: charging a $5 fee")
            self.balance-= 5
        return self

    def display_account_info(self):
        print(f"balance: ${self.balance}")

    def yield_interest(self ):
        int_rate=self.balance*self.int_rate
        total=self.balance+int_rate
        return total

class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account = BankAccount(int_rate=0.02, balance=0)

    def make_deposit(self,amount):
        self.account.deposit(amount)
        return self
    def make_withdrawl(self,amount):
        self.account.withdraw(amount)
        return self
    def display_user_info(self,amount):
        self.account.display_account_info()
        
    
    


