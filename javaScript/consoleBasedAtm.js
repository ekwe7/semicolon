//Console-based ATM system

//let account_balance = 50000;
let history = {};
let withdrawCharge = 100;
let withdraw_limit = 20000;
let currentBalance = 0;
let current_withdraw = 0;

console.log("Welcom to Jigs Bank")

const prompt = require("prompt-sync")();
let userInput = Number(prompt("Enter your current balance: "))



while(true){
	let account_balance = prompt("What is your current balance: " + userInput)
	currentBalance = currentBalance - userInput;
	
	if (userInput != account_balance){	
	console.log("Enter correct figuer")
	}else 
   	if(userInput == account_balance){
	currentBalance = account_balance
	console.log("Your current balance is", currentBalance)
}

	if(current_withdraw > currentBalance && current_withdraw >  withdraw_limit){
		console.log("withdrawal limit exceded")
	}else 

	if(current_withdraw < currentBalance){
	current_withdrawal = userInput + withdrawCharge
	console.log(current_withdrawal)
	consolse.log("your current balance is ", currentBalance)

	}else if(userInput > currentBalance){
		console.log("insufficient fund")
	}else if(currentBalance < 100){
		console.log("insufficient fund")
	}



}

	
