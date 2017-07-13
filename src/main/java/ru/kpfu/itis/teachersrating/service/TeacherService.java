package ru.kpfu.itis.teachersrating.service;

import ru.kpfu.itis.teachersrating.form.TeacherForm;
import ru.kpfu.itis.teachersrating.model.Teacher;

import java.util.List;

public interface TeacherService {

    //достает всех учителей
    List<Teacher> getAllTeachers();

    //достает учителя по id
    Teacher getTeacherById(Long teacherId);

    //сохраняем
    void saveTeacherByForm(TeacherForm form);

    //удаляем
    void removeTeacher(Long teacherId);

    void saveChanges(Long teacherId, TeacherForm form);
}
