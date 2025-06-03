import unittest
from bank import Bank

class TestBankApp(unittest.TestCase):

def test_withdraw(self):
	bank = Bank()
	bank.create_account("Eddy")
	bank.deposit("Eddy", 90000)
	bank.withdraw("Eddy", 20000)
		self.assertEqual(bank.accounts["Eddy"], 1000)

def test_withdraw_insufficient_funds(self):
	bank = Bank()
	bank.create_account("Eddy")
		self.assertRaises(ValueError):
	bank.withdraw("Eddy", 95000)
def test_withdrawal_funds(self):
	bank = Bank()
	bank.withdraw_funds("Eddy")
		self.assertEqual(ValueSufficient):
	bank.withdrawal("Eddy", 20000)
