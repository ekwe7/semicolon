#Console-based ATM system

account_balance = 50000
history = []
withdraw_charge = 100
withdrawal_limit = 20000
current_balance = 0

print("Welcom to Jigs Bank")
user_input = int(input("Enter your account Balance "))

if user_input != account_balance:	
	user_input = int(input("Enter the correct account balance "))
elif user_input == account_balance:
	current_balance = account_balance
	print("Your current balance is", current_balance)


 
while True:
	withdrawal = int(input("how much do you want to withdraw: "))
	current_balance = account_balance - withdrawal

	if(withdrawal > current_balance and withdrawal >  withdrawal_limit):
		print("withdrawal limit exceded")

	elif(withdrawal < account_balance):
		current_withdrawal = withdrawal + withdraw_charge
		history.append(current_balance)
		print(current_withdrawal)
		print("your current balance is ", current_balance)
	elif(current_balance < 100):
		print("insufficient fund")
	else:
		print(history)



	
