let currentQuestionIndex = 0;
let questions = [];
let totalQuestions = 0;
let correctAnswers = 0;

async function fetchQuestions() {
    try {
        const response = await fetch('http://localhost:8080/api/questions');
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        questions = await response.json();
        totalQuestions = questions.length;
        document.getElementById('total-questions').textContent = totalQuestions;
        displayQuestions();
    } catch (error) {
        console.error('Error fetching questions: ', error);
        document.getElementById('question-text').textContent =
            "⚠️ Oops! We could not load the quiz questions. Please check your connection or try refreshing the page.";
    }
}

function displayQuestions() {
    if (questions.length === 0) return;

    const questionText = document.getElementById('question-text');
    const questionContainer = document.getElementById('options-container');
    const currentQuestion = questions[currentQuestionIndex];

    questionText.textContent = currentQuestion.questionText;
    questionContainer.innerHTML = ''; // Clear previous options

    currentQuestion.options.forEach(option => {
        const button = document.createElement('button');
        button.textContent = option;
        button.className = 'option';
        button.onclick = () => checkAnswer(option);
        questionContainer.appendChild(button);
    });

    document.getElementById('current-question').textContent = currentQuestionIndex + 1;
}

function checkAnswer(selectedOption) {
    const currentQuestion = questions[currentQuestionIndex];
    if (selectedOption === currentQuestion.correctAnswer) {
        correctAnswers++; // Increase score
    }

    nextQuestion();
}

function nextQuestion() {
    if (currentQuestionIndex < questions.length - 1) {
        currentQuestionIndex++;
        displayQuestions();
    } else {
        localStorage.setItem('quizScore', correctAnswers);
        localStorage.setItem('totalQuestions', totalQuestions);
        window.location.href = 'result.html'; // Redirect to result page
    }
}

window.onload = fetchQuestions;
