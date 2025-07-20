#Guess the number between 1-1000
import random

print('==GUESS NUMBER==')

number_guess = random.randrange(1, 11)

user_guess = int(input('Enter 0 to start: '))
if user_guess < 0 or user_guess > 0:
    print('please recompile the program')
else:
    while True:
        user_input = int(input('Enter a number between 1 and 10: '))
        if user_input <= 0 or user_input > 10:
            print('please enter a number between 1 and 10')
        elif user_input < number_guess:
            print('Number is too low')
        elif user_input > number_guess:
            print('Number is too high')
        else:
            print('Correct!')

            user_responce = int(input('Enter 5 to continue or 0 to quit: '))
            if user_responce == 0:
                print('Goodbye!')
            elif user_responce == 5:
                user_guess = random.randrange(1, 11)
                print('\n About to start new game')
            else:
                print('Enter 0 to quit')
                break
