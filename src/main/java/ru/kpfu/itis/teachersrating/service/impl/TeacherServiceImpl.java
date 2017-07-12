package ru.kpfu.itis.teachersrating.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.teachersrating.form.TeacherForm;
import ru.kpfu.itis.teachersrating.model.Teacher;
import ru.kpfu.itis.teachersrating.repository.TeacherRepository;
import ru.kpfu.itis.teachersrating.service.FileService;
import ru.kpfu.itis.teachersrating.service.TeacherService;

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
    @Autowired
    FileService fileService;

    //достает всех учителей
    @Override
    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = teacherRepository.findAll();
        teachers = teachers.stream()
                .sorted(Comparator.comparing(Teacher::getLastname)
                                .thenComparing(Comparator.comparing(Teacher::getFirstname)))
                .collect(Collectors.toList());
        return teachers;
    }

    //достает учителя по id
    @Override
    public Teacher getTeacherById(Long teacherId) {
        return teacherRepository.findOne(teacherId);
    }

    @Override
    @Transactional
    public void saveTeacherByForm(TeacherForm form) {
        Teacher teacher = new Teacher();
        teacher.setFirstname(form.getFirstname());
        teacher.setLastname(form.getLastname());
        if (form.getFile().isEmpty()) {
            teacher.setImagePath("/img/defaultImage.jpg");
        } else {
            teacher.setImagePath("/img/" + fileService.saveImage(form.getFile()));
        }
        teacherRepository.save(teacher);
    }

    @Override
    public void removeTeacher(Long teacherId) {
        teacherRepository.delete(teacherId);
    }

    @Override
    @Transactional
    public void saveChanges(Long teacherId, TeacherForm form) {
        Teacher teacher = teacherRepository.findOne(teacherId);
        teacher.setFirstname(form.getFirstname());
        teacher.setLastname(form.getLastname());
        teacherRepository.save(teacher);
    }
}
