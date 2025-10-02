class Account:
    def __init__(self, name, balance, ):
        self.name = name
        self.balance = balance
        self.GetBalance


    def deposit(self):
        amount = int(input("How much do you want to deposit? "))
        self.balance += amount
        return self.balance

    def SetBalance(self, value):
        if self.name:
            self.balance = value



    def GetBalance(self):
        return self.balance


    def withdraw():
        amount = int(input("How much do you want to withdraw? "))
        if amount > self.balance:
                self.balance -= amount
        return amount

Tosin_Account = Account(name, balance)
Tosin_Account.deposit()





