package Devo.example.DevQuizzer.service;

import Devo.example.DevQuizzer.entity.QuizQuestion;
import Devo.example.DevQuizzer.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    public List<QuizQuestion> getAllQuestion(){
        List<QuizQuestion> questionRepoAll=questionRepo.findAll();
        return  questionRepoAll;
    }

    public QuizQuestion saveQuestion(QuizQuestion question){
        QuizQuestion save=questionRepo.save(question);
        return save;
    }
}
