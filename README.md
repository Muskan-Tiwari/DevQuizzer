# DevQuizzer 🎯

**DevQuizzer** is a full-stack web quiz application that allows users to log in, take a quiz, and view their score with personalized feedback.

## 🚀 Features

- 🔐 Basic login system
- 📡 Fetch questions dynamically using REST API
- ✅ Answer selection and correctness check
- 📊 Result screen with score and feedback
- 🔄 LocalStorage-based quiz progress tracking

## 🛠️ Tech Stack

- **Backend**: Java, Spring Boot, Spring Data JPA, MySQL
- **Frontend**: JavaScript, HTML, CSS
- **Database**: MySQL
- **Tools**: Postman, IntelliJ IDEA / VS Code

## 🖥️ How to Run

1. Clone the repo  
   `git clone https://github.com/muskantiwari/DevQuizzer`

2. Start your MySQL server and create a DB named `DevQuizzer`

3. Run the Spring Boot application  
   It will auto-create necessary tables.

4. Open `index.html` in your browser (via Live Server or localhost)

> 💡 Ensure CORS is enabled in backend for your frontend port (like 127.0.0.1:5500)

## 📌 Sample API Routes

- `POST /api/login` – basic login check  
- `GET /api/questions` – get all quiz questions  
- `POST /api/save` – save new question

---
## 👩‍💻 Author

**Muskan Tiwari**  
Java | Spring Boot | Web Developer  
📬 Connect on [LinkedIn](https://www.linkedin.com/in/muskantiwari)

---

> ✨ This project is part of my full-stack learning journey. Feedback is welcome!
