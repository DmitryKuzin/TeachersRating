package ru.kpfu.itis.teachersrating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String saveNewTeacher(@ModelAttribute("add_form") @Valid AddTeacherForm form){
        teacherService.saveNewTeacher(form);
        return "redirect:/teacher";
    }

    @RequestMapping(value = "/admin/edit/teacher/{teacherId}", method = RequestMethod.GET)
    public String editTeacher(@PathVariable Long teacherId, Model model){
        model.addAttribute("add_form", new AddTeacherForm());
        model.addAttribute("teacher", teacherService.getTeacherById(teacherId));
        return "edit_teacher";
    }

    @RequestMapping(value = "/admin/edit/teacher/{teacherId}", method = RequestMethod.POST)
    public String saveChanges(@PathVariable Long teacherId, @ModelAttribute("add_form") @Valid AddTeacherForm form){
        teacherService.saveChanges(teacherId, form);
        return "redirect:/teacher";
    }

    @RequestMapping(value = "/admin/remove/teacher/{teacherId}", method = RequestMethod.GET)
    public String removeTeacher(@PathVariable Long teacherId){
        teacherService.removeTeacher(teacherId);
        return "redirect:/teacher";
    }
}
