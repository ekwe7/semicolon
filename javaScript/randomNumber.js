function randomNumber(){

let prompt = require("prompt-sync")();

let minuend = Math.floor(Math.random()*10)+10
//console.log(minuend);
let subtrand = Math.floor(Math.random()*10)+1
//console.log(subtrand);

let numberDivision = minuend - subtrand;

let result = prompt("Enter your anwser: ")
let numberChecker = 0;

let counterFail = 0;
let counterPass = 0;


while(numberChecker != 10){
	//console.log(result = numberDivision)
	minuend = Math.floor(Math.random()*10)+10
	//console.log(minuend);
	//subtrand = Math.floor(Math.random()*10)+1
	//console.log(subtrand);
	result = prompt("Enter your anwser: " + minuend + '-' + subtrand + " ")


numberChecker++



if(numberChecker == result){
	counterFail --
	console.log(minuend);

  }else if(numberChecker == result){
	counterPass++
	console.log(subtrand);
  }

    }


};



let output = randomNumber();

console.log(output)
console.log(counterFail = subtrand)
console.log(counterPass = minuend)



