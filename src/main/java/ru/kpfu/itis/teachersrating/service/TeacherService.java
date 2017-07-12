package ru.kpfu.itis.teachersrating.service;

import ru.kpfu.itis.teachersrating.form.AddTeacherForm;
import ru.kpfu.itis.teachersrating.model.Teacher;

import java.util.List;

/**
 * Created by Roman on 12.07.2017.
 */
public interface TeacherService {

    //достает всех учителей
    List<Teacher> getAllTeachers();

    //достает учителя по id
    Teacher getTeacherById(Long teacherId);

    void saveNewTeacher(AddTeacherForm form);
}
