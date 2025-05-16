def multiple_of_number_without_simbol(number1, number2):
	result = 0
	number = 0
	if number < 0:
		for number in range (0, abs(number1)):
			result = result + number2 
		return -result
	else:
		for number in range (0, abs(number1)):
			result = result - number2
		return result

#print(multiple(2, 8))

number1 = int(input("Enter first number: "))
number2 = int(input("Enter second number: "))

print(multiple_of_number_without_simbol(number1, number2))
