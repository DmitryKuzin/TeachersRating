package ru.kpfu.itis.teachersrating.form;

import org.hibernate.validator.constraints.NotEmpty;
import ru.kpfu.itis.teachersrating.model.Role;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Size;

public class AddTeacherForm {
    @NotEmpty(message = "Поле не может быть пустым")
    @Size(min = 2, max = 30, message = "Максимальная длина 30 символов")
    private String name;

//    @NotEmpty(message = "Поле не может быть пустым")
//    @Size(min = 2, max = 30, message = "Максимальная длина 30 символов")
//    private String surname;

//    @Enumerated(EnumType.STRING)
//    private Role role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
}
