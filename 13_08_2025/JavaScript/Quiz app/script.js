const quizData = [
  {
    question: "Which keyword is used to declare a constant in JavaScript?",
    options: ["var", "let", "const", "static"],
    answer: 2,
  },
  {
    question: "What will `typeof NaN` return?",
    options: ["number", "NaN", "undefined", "object"],
    answer: 0,
  },
  {
    question:
      "Which method is used to convert a JSON string into a JavaScript object?",
    options: [
      "JSON.stringify()",
      "JSON.parse()",
      "JSON.objectify()",
      "JSON.convert()",
    ],
    answer: 1,
  },
  {
    question: "What will `console.log(0 == '0')` print?",
    options: ["true", "false", "undefined", "error"],
    answer: 0,
  },
  {
    question: "Which of the following is NOT a JavaScript data type?",
    options: ["string", "boolean", "float", "undefined"],
    answer: 2,
  },
];

let currentQuestion = 0;
let score = 0;

const questionEl = document.getElementById("question");
const optionsEl = document.getElementById("options");
const feedbackEl = document.getElementById("feedback");
const scoreEl = document.getElementById("score");
const nextBtn = document.getElementById("next-btn");

function loadQuestion() {
  const q = quizData[currentQuestion];
  questionEl.textContent = q.question;
  optionsEl.innerHTML = "";
  feedbackEl.textContent = "";
  nextBtn.style.display = "none";

  q.options.forEach((option, index) => {
    const btn = document.createElement("button");
    btn.textContent = option;
    btn.onclick = () => selectAnswer(index);
    optionsEl.appendChild(btn);
  });
}

function selectAnswer(selectedIndex) {
  const correct = quizData[currentQuestion].answer;
  if (selectedIndex === correct) {
    feedbackEl.textContent = "✅ Correct!";
    score++;
    scoreEl.textContent = score;
  } else {
    feedbackEl.textContent = "❌ Wrong!";
  }
  Array.from(optionsEl.children).forEach((btn, idx) => {
    btn.disabled = true;
    if (idx === correct) btn.style.backgroundColor = "#90ee90";
    else if (idx === selectedIndex) btn.style.backgroundColor = "#ffb6b6";
  });
  nextBtn.style.display = "block";
}

nextBtn.onclick = () => {
  currentQuestion++;
  if (currentQuestion < quizData.length) {
    loadQuestion();
  } else {
    questionEl.textContent = "Quiz Finished!";
    optionsEl.innerHTML = "";
    feedbackEl.textContent = `Your final score: ${score}/${quizData.length}`;
    nextBtn.style.display = "none";
  }
};

loadQuestion();
