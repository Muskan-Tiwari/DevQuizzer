package Devo.example.DevQuizzer.repo;

import Devo.example.DevQuizzer.entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<QuizQuestion,Long> {
}
