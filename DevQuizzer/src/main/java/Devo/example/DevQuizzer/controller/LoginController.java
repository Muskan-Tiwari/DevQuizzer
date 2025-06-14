package Devo.example.DevQuizzer.controller;

import Devo.example.DevQuizzer.dto.LoginRequest;
import Devo.example.DevQuizzer.entity.QuizQuestion;
import Devo.example.DevQuizzer.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    QuestionService questionService;

    // Hardcoded credentials for now
    private final String USERNAME = "user";
    private final String PASSWORD = "password";

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest){
        if(USERNAME.equals(loginRequest.getUsername())&& PASSWORD.equals(loginRequest.getPassword())){
            return "Login Successful";
        }
        else {
            return "Invalid username or password";
        }
    }

    @GetMapping("/questions")
    public List<QuizQuestion> getQuestion(){
        return questionService.getAllQuestion();
    }

    @PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
    public QuizQuestion saveQuestion(@RequestBody QuizQuestion question) {
        return questionService.saveQuestion(question);
    }
}
