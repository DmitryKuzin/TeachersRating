package ru.kpfu.itis.teachersrating.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.teachersrating.model.Question;
import ru.kpfu.itis.teachersrating.model.Teacher;
import ru.kpfu.itis.teachersrating.model.TeacherRating;

import java.util.List;

public interface TeacherRatingRepository extends JpaRepository<TeacherRating, Long> {

    List<TeacherRating> findByTeacher(Teacher teacher);

    List<TeacherRating> findByQuestion(Question question);
}
