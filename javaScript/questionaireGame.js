
const userHistory = {
correct: [],
missed: [],

}

function userQuestionaire(){

//ARRAY TO HOLD ALL OBJECTS
let arrayList = {

//OBJECT OF QUESTION AND ANWSERS
let userQuestion1 = {
question1: "What is the capital of Nigeria: ",
options: "yaba, lagos, abuja",
anwser: "lagos"
}

let userQuestion2 = {
question2: "Where is Semicolon located: ",
options: "ketu, idroko, yaba",
anwser: "yaba"

}

let userQuestion3 = {
question3: "what is the capital of brazil: ",
options: "brazil, niger, oyo, oshun",
anwser: "brazil"

};

let userQuestion4 = {
question: "what is the first language thought in semicolon: ",
options: "Python, oop, java, javascript",
anwser: "java"

};
let userQuestion5 = {
question: "how many cohorts are currently in semicolon: ",
options: "five, six, three",
anwser: "five"

};
let userQuestion6 = {
question3: "How much do semicolon charge for there program: ",
options: "six million, two million, five hundread",
anwser: "six million"

};
let userQuestion7 = {
question3: "what is the name of the chief of semicolon: ",
options: "Chibuzo, tobi, sam",
anwser: "sam"

};
let userQuestion8 = {
question3: "what is the first course taken in semicolon: ",
options: "design thinking, critical thinking, java, maths",
anwser: "design thinking"
};

return userQuestionaire;
} 
}
 
// ITERATE THROUGHT THE ARRAY
for(let index = 0; index < arrayList.length; index++){
	console.log(index);
}

		const prompt = require("prompt-sync")();	
		
		if(useranswer !== userQuestion1 ){
		console.log("Select a valide question number: ");
		}else 
		if(useranswer == index){
		let useranswer = prompt("Which question do you want to anwser: ")
		}

	let output = userQuestionaire();
	console.log(output);





