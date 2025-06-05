const prompt = require("prompt-sync")();

// Object to track correct and missed answers
const userHistory = {
  correct: [],
  missed: [],
};

// Function returns an array of question objects
function userQuestionnaire() {
  const questions = [
    {
      question: "What is the capital of Nigeria?",
      options: ["yaba", "lagos", "abuja"],
      answer: "lagos",
    },
    {
      question: "Where is Semicolon located?",
      options: ["ketu", "idroko", "yaba"],
      answer: "yaba",
    },
    {
      question: "What is the capital of Brazil?",
      options: ["brazil", "niger", "oyo", "oshun"],
      answer: "brazil",
    },
    {
      question: "What is the first language taught in Semicolon?",
      options: ["Python", "oop", "java", "javascript"],
      answer: "java",
    },
    {
      question: "How many cohorts are currently in Semicolon?",
      options: ["five", "six", "three"],
      answer: "five",
    },
    {
      question: "How much does Semicolon charge for their program?",
      options: ["six million", "two million", "five hundred"],
      answer: "six million",
    },
    {
      question: "What is the name of the chief of Semicolon?",
      options: ["Chibuzo", "tobi", "sam"],
      answer: "sam",
    },
    {
      question: "What is the first course taken in Semicolon?",
      options: ["design thinking", "critical thinking", "java", "maths"],
      answer: "design thinking",
    },
  ];

  return questions;
}

// MAIN APP FUNCTION
function startQuiz() {
  const questions = userQuestionnaire();

  for (let index = 0; index < questions.length; index++) {
    const userquestion = questions[index];
    console.log(userquestion.question);
    console.log(userquestion.options.join(", "));

    const userAnswer = prompt("Your answer: ").toLowerCase();

    if (userAnswer === userquestion.answer.toLowerCase()) {
      console.log("Correct!");
      userHistory.correct.push(userquestion.question);
    }   }

  console.log("Correct Answers:", userHistory.correct.length);
  console.log("Missed Answers:", userHistory.missed.length);
}

startQuiz();