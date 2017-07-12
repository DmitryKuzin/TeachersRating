package ru.kpfu.itis.teachersrating.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.teachersrating.form.AddTeacherForm;
import ru.kpfu.itis.teachersrating.model.Teacher;
import ru.kpfu.itis.teachersrating.repository.TeacherRepository;
import ru.kpfu.itis.teachersrating.service.TeacherService;
import ru.kpfu.itis.teachersrating.util.TeacherAddFormTransformer;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Roman on 12.07.2017.
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    //достает всех учителей
    @Override
    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = teacherRepository.findAll();
        teachers = teachers.stream().sorted(Comparator.comparing(Teacher::getName)).collect(Collectors.toList());
        return teachers;
    }

    //достает учителя по id
    @Override
    public Teacher getTeacherById(Long teacherId) {
        return teacherRepository.findOne(teacherId);
    }

    @Override
    @Transactional
    public void saveNewTeacher(AddTeacherForm form) {
        Teacher teacher = TeacherAddFormTransformer.transform(form);
        teacherRepository.save(teacher);
    }
}
