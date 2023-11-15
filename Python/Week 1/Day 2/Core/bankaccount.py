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

    def display_account_info(self):
        print(f"balance: ${self.balance}")

    def yield_interest(self ):
        int_rate=self.balance*self.int_rate
        total=self.balance+int_rate
        return total
kiki=backaccount(0.3,2)
kiki.deposit(2)
kiki.withdraw(30)
kiki.display_account_info()
kiki.yield_interest()