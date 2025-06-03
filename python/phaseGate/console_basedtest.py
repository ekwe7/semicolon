class Bank:
def _init_(self):
self.accounts = {}

def withdraw(self, name, amount):
if name not in self.accounts:
	raise ValueError("Account does not exist.")
	if self.accounts[name] < amount:
	raise ValueError("Insufficient funds.")
	self.accounts[name] -= amount
def withdraw_insufficient-fund(self, amount):
if amount not equals self.account:
	raise ValueErro("insufficient fund")
	if self.accounts[amount] - withdraw
	raise ValueEquals("successful.")
	self.account[amount] = withdraw