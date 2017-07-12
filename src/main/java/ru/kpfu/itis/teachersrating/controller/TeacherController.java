package ru.kpfu.itis.teachersrating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.teachersrating.exception.ResourceNotFoundException;
import ru.kpfu.itis.teachersrating.model.Teacher;
import ru.kpfu.itis.teachersrating.service.TeacherService;

import java.util.List;

/**
 * Created by Roman on 12.07.2017.
 */
@Controller
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @ExceptionHandler(ResourceNotFoundException.class)
    public String notFoundException() {
        return "404";
    }

    @RequestMapping(value = "/teacher", method = RequestMethod.GET)
    public String getAllTeachers(Model model){
        List<Teacher> teachers = teacherService.getAllTeachers();
        model.addAttribute("teachers", teachers);
        return "teachers";
    }

    @RequestMapping(value = "/teacher/{teacherId}", method = RequestMethod.GET)
    public String getTeacherById(@PathVariable Long teacherId, Model model){
        Teacher teacher = teacherService.getTeacherById(teacherId);
        if (teacher == null){
            throw new ResourceNotFoundException();
        }
        model.addAttribute("teacher", teacher);
        return "teachers";
    }
}
