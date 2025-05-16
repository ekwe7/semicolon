loan_amount = int(input("Enter amount you want to loan: "))

yearsof_interest = int(input("Enter number of years: "))

interest_rate = int(input("Enter interest rate: "))

interest = interest_rate / 100

for loop in range(yearsof_interest):

	accumulated_interest = (interest - 1) * yearsof_interest * interest + loan_amount

	print(accumulated_interest)
