package ru.kpfu.itis.teachersrating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.teachersrating.form.AddTeacherForm;
import ru.kpfu.itis.teachersrating.service.TeacherService;

import javax.validation.Valid;


@Controller
//@PreAuthorize("hasRole('ROLE_ADMIN')")
public class AdminController {
    @Autowired
    TeacherService teacherService;
    @Autowired
    TeacherController teacherController;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAdminPage(){
        return "admin_page";
    }

    @RequestMapping(value = "/admin/add/teacher", method = RequestMethod.GET)
    public String addNewTeacher(Model model){
        model.addAttribute("add_form", new AddTeacherForm());
        return "registration_teacher";
    }

    @RequestMapping(value = "/admin/add/teacher", method = RequestMethod.POST)
    public String saveNewTeacher(@ModelAttribute("userform") @Valid AddTeacherForm form, Model model){
        teacherService.saveNewTeacher(form);
        return "redirect:/teacher";
    }
}
