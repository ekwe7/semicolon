import random
def rock_paper_game():
	print("Welcome to my rock paper game ")

make_choice = ['rock', 'paper', 'scissors' ]
choice_play = input("play your choice (rock, paper, scissors):")

if choice_play != make_choice:
	print("Invalide entry please try again later")


computre_choice = random.choice(make_choice)
print(f"the computer choose {computer_choice}")

if choice_play == computre_choice:
	print("It's a tie")
	
elif	choice_play == "rock" and computre_choice == "scissors":
	print("you win")
elif	choice_play == "scissors" and computre_choice == "paper":
	print("you win")
elif	choice_play == "paper" and computre_choice == "rock":
	print("you win")
else :
	print("computer wins")
