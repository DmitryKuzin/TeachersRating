package ru.kpfu.itis.teachersrating.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.teachersrating.model.Question;
import ru.kpfu.itis.teachersrating.model.QuestionAnswer;
import ru.kpfu.itis.teachersrating.model.Teacher;
import ru.kpfu.itis.teachersrating.model.User;

import java.util.List;

public interface QuestionAnswerRepository extends JpaRepository<QuestionAnswer, Long> {

    List<QuestionAnswer> findByTeacher(Teacher teacher);

    List<QuestionAnswer> findByTeacherAndQuestion(Teacher teacher, Question question);

    List<QuestionAnswer> findByTeacherAndUser(Teacher teacher, User user);
}
